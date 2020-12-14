package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.User;
import com.evildoer.evaluation.model.form.ChangePassword;
import com.evildoer.evaluation.model.form.LoginForm;
import com.evildoer.evaluation.model.form.UnitRegisterForm;
import com.evildoer.evaluation.model.vo.UserVo;
import com.sun.istack.internal.NotNull;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface IUserService extends IService<User> {

    ServerResponse login(User user);

    String getDataByToken();

    String getDataByToken(String token);

    ServerResponse register(User user);

    ServerResponse changePassword(ChangePassword changePassword);

    String flushToken();

    String flushToken(@NotNull String token);

//    Page<UserVo> pageByQuery(UserQuery query);

    void updateUserRole(UserVo userVo);

    ServerResponse updateByUserVo(UserVo userVo);

    ServerResponse unitRegisterForm(UnitRegisterForm data);

    /**
     * @Author 安羽兮
     * @Description 用户名是否已经被使用
     * @Date 9:41 2020/11/20
     * @Param [username]
     * @Return boolean
     **/
    public boolean usernameIsExist(String username);

    ServerResponse findUserByIdCard(String idcard);

    ServerResponse addUserToBranch(Long userId, Long branchId);

    ServerResponse unitLogin(LoginForm loginForm);
}
