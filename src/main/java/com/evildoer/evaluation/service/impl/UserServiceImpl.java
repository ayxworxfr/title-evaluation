package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.common.authentication.JWTUtil;
import com.evildoer.evaluation.common.domain.Const;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.UserMapper;
import com.evildoer.evaluation.model.entity.Person;
import com.evildoer.evaluation.model.entity.Unit;
import com.evildoer.evaluation.model.entity.User;
import com.evildoer.evaluation.model.form.ChangePassword;
import com.evildoer.evaluation.model.form.LoginForm;
import com.evildoer.evaluation.model.form.UnitRegisterForm;
import com.evildoer.evaluation.model.vo.UserVo;
import com.evildoer.evaluation.service.IPersonService;
import com.evildoer.evaluation.service.IUnitService;
import com.evildoer.evaluation.service.IUserService;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    private final IUnitService unitService;

    private final IPersonService personService;

    public UserServiceImpl(IUnitService unitService, IPersonService personService) {
        this.unitService = unitService;
        this.personService = personService;
    }

    @Override
    public ServerResponse login(User u) {
        if (StringUtils.isEmpty(u.getUsername())) {
            return ServerResponse.createByErrorMessage("用户名不能为空!");
        } else if (StringUtils.isEmpty(u.getPassword())) {
            return ServerResponse.createByErrorMessage("密码不能为空!");
        }
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(User::getUsername, u.getUsername())
                .eq(User::getPassword, u.getPassword());
        User user = this.getOne(queryWrapper);
        if (null != user) {          // 登录成功
            UserVo userVo = getUserVoByUser(user);
            return ServerResponse.createBySuccessMessage("login success", userVo);
        }
        // 登录失败
        return ServerResponse.createByErrorMessage("用户名或密码错误");
    }


    /**
     * @Author 安羽兮
     * @Description 个人账户注册
     * @Date 10:05 2020/11/20
     * @Param [user]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @Override
    public ServerResponse register(User user) {
        if (null == user) {
            return ServerResponse.createByErrorMessage("注册失败!");
        } else if (StringUtils.isEmpty(user.getUsername())) {
            return ServerResponse.createByErrorMessage("用户名不能为空!");
        } else if (StringUtils.isEmpty(user.getPassword())) {
            return ServerResponse.createByErrorMessage("密码不能为空!");
        }
        if (usernameIsExist(user.getUsername()))
            ServerResponse.createByErrorMessage("该用户名已被使用!");
        user.setType(Const.Role.PERSON.getCode());
        save(user);
        UserVo userVo = getUserVoByUser(user);
        return ServerResponse.createBySuccessMessage("register success", userVo);
    }

    @Override
    public ServerResponse unitRegisterForm(UnitRegisterForm data) {
        if (usernameIsExist(data.getUsername()))
            ServerResponse.createByErrorMessage("该用户名已被使用!");
        Unit unit = new Unit();
        User user = new User();
        BeanUtils.copyProperties(data, unit);
        unitService.saveOrUpdate(unit);
        user.setUsername(data.getUsername());
        user.setPassword(data.getPassword());
        user.setType(Const.Role.UNIT.getCode());        // 设置用户类型为单位用户
        user.setUnitId(unit.getId());

        save(user);
        if (null != unit.getUserId())       // 将单位注册人和单位工作人双向绑定
            unit.setUserId(user.getId());
        UserVo userVo = getUserVoByUser(user);
        return ServerResponse.createBySuccessMessage("register success", userVo);
    }

    /**
     * @Author 安羽兮
     * @Description 通过用户信息签署token, 返回UserVo
     * @Date 9:47 2020/11/20
     * @Param [user]
     * @Return UserVo
     **/
    private UserVo getUserVoByUser(@NotNull User user) {
        // 使用用户id+role注册token, 使用用户密码加密
        String role = Const.Role.values()[user.getType()].getRole();
        String token = JWTUtil.encryptToken(JWTUtil.sign(user.getId().toString() + "," + role, user.getPassword()));
        UserVo userVo = new UserVo();
        userVo.setToken(token);
        BeanUtils.copyProperties(user, userVo);
        userVo.setPassword(Const.PASSWORD);
        // 通过type属性获取角色名称
        userVo.setRole(role);
        return userVo;
    }

    /**
     * @Author 安羽兮
     * @Description 用户名是否已经被使用
     * @Date 9:41 2020/11/20
     * @Param [username]
     * @Return boolean
     **/
    @Override
    public boolean usernameIsExist(String username) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(User::getUsername, username);
        if (this.getOne(queryWrapper) != null) {
            return true;
        }
        return false;
    }

    @Override
    public ServerResponse findUserByIdCard(String idcard) {
        LambdaQueryWrapper<Person> query = new LambdaQueryWrapper<>();
        query.eq(Person::getIdcard, idcard);
        User user = null;
        Person person = personService.getOne(query);
        if (null != person) {
            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
            queryWrapper.eq(User::getPersonId, person.getId());
            user = this.getOne(queryWrapper);
        }
        if (null != person && null != user) {
            user.setPassword(Const.PASSWORD);
            return ServerResponse.createBySuccess(user);
        }
        return ServerResponse.createByErrorMessage("该用户不存在！");
    }

    @Override
    public ServerResponse addUserToBranch(Long id, Long userId) {
        User user = this.getById(userId);
        if (null == user)
            return ServerResponse.createByErrorMessage("该用户不存在！");
        if (null != user.getBranchId())
            return ServerResponse.createByErrorMessage("该用户已经有所属分公司！");
        user.setBranchId(id);
        this.updateById(user);
        return ServerResponse.createBySuccess("添加成功");
    }

    @Override
    public ServerResponse unitLogin(LoginForm loginForm) {
        // 校验该单位是否有此用户
        Unit unit = unitService.getByName(loginForm.getUnit());
        if (null != unit)
            loginForm.setUnitId(unit.getId());
        User user = new User();
        BeanUtils.copyProperties(loginForm, user);
        return this.login(user);
    }

    @Override
    public ServerResponse changePassword(ChangePassword changePassword) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(User::getUsername, changePassword.getUsername())
                .eq(User::getPassword, changePassword.getOldPassword());
        User user = getOne(queryWrapper);
        user.setPassword(changePassword.getNewPassword());
        Boolean result = saveOrUpdate(user);
        if (result) {
            return ServerResponse.createBySuccess("密码修改成功!");
        } else {
            return ServerResponse.createBySuccess("密码修改失败!");
        }
    }

//    @Override
//    public Page<UserVo> pageByQuery(UserQuery query) {
//        Page page = new Page<>(query.getPage(), query.getSize());
//        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
//        if (!StringUtils.isEmpty(query.getUsername())) {
//            queryWrapper.eq(User::getUsername, query.getUsername());
//        }
//        Page data = page(page, queryWrapper);
//        List<UserVo> userVos = new ArrayList<>();
//        data.getRecords().stream().forEach(user -> {
//            UserVo userVo = new UserVo();
//            BeanUtils.copyProperties(user, userVo);
//            List roles = roleService.getRoles(((User) user).getId());
//            userVo.setRoles(roles);
//            userVo.setPassword(Const.PASSWORD);
//            userVos.add(userVo);
//        });
//        data.setRecords(userVos);
//        return data;
//    }

    @Override
    public String flushToken() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader(Const.TOKEN);
        return this.flushToken(token);
    }

    @Override
    public String flushToken(@NotNull String token) {
        String data = this.getDataByToken(token);
        User user = getById(data.split(",")[0]);
        // 用户信息获取失败
        if (user == null) {
            return null;
        }
        // 用户信息获取成功
        // 使用用户id+role重新注册token, 使用用户密码加密
        String newToken = JWTUtil.encryptToken(JWTUtil.sign(data, user.getPassword()));
        return newToken;
    }

    @Override
    public ServerResponse updateByUserVo(UserVo userVo) {
        User user = new User();
        BeanUtils.copyProperties(userVo, user);
        User u = getById(user.getId());
        if (null != u) {
            user.setPassword(u.getPassword());
            Boolean result = saveOrUpdate(user);
            if (result) {
                // todo: 更新用户角色信息
//                if (userVo.getRoles() != null && userVo.getRoles().size() > 0)
//                    this.updateUserRoles(userVo);
                return ServerResponse.createBySuccess("用户信息更新成功");
            }
        }
        return ServerResponse.createByErrorMessage("用户信息更新失败");
    }

    /**
     * @Author 安羽兮
     * @Description 通过token获取用户id
     * @Date 11:37 2020/6/30
     * @Param []
     * @Return java.lang.String
     **/
    @Override
    public String getDataByToken() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = request.getHeader(Const.TOKEN);
        return getDataByToken(token);
    }

    /**
     * @Author 安羽兮
     * @Description 直接解析传入的token
     * @Date 14:30 2020/7/16
     * @Param [token]
     * @Return java.lang.String
     **/
    @Override
    public String getDataByToken(String token) {
        if (StringUtils.isEmpty(token))
//            throw new AuthenticationException("请登录后访问！");
            return null;
        token = JWTUtil.decryptToken(token);            // 解密token
        String data = JWTUtil.getName(token);
        User user = this.getById(data.split(",")[0]);
        // 校验token是否合法
        if (!JWTUtil.verify(token, data, user.getPassword()))
//            throw new AuthenticationException("token校验不通过");
            return null;
        return data;
    }

    /**
     * @Author 安羽兮
     * @Description 通过传入的UserVo更新对应用户的角色
     * @Date 12:48 2020/7/18
     * @Param [userVo]
     * @Return void
     **/
    @Override
    public void updateUserRole(@NotNull UserVo userVo) {

    }
}
