package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.Const;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.User;
import com.evildoer.evaluation.model.form.ChangePassword;
import com.evildoer.evaluation.model.form.UnitRegisterForm;
import com.evildoer.evaluation.service.IUserService;
import com.evildoer.evaluation.utils.UploadUtils;
import com.sun.istack.internal.NotNull;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/system")
public class SystemController {

    private final IUserService userService;

    private final ResourceLoader resourceLoader;

    public SystemController(IUserService userService, ResourceLoader resourceLoader) {
        this.userService = userService;
        this.resourceLoader = resourceLoader;
    }

    @PostMapping("/login")
    public ServerResponse login(@NotNull @RequestBody User user) {
//        //校验验证码
//        //session中的验证码
//        String sessionCaptcha = (String) SecurityUtils.getSubject().getSession().getAttribute(CaptchaController.KEY_CAPTCHA);
//        if (null == captcha || !captcha.equalsIgnoreCase(sessionCaptcha)) {
//            return CommonResult.failed("验证码错误");
//        }

        return this.userService.login(user.getUsername(), user.getPassword());
    }


    /**
     * @Author 安羽兮
     * @Description 单位用户登录
     * @Date 9:03 2020/11/20
     * @Param [user]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @PostMapping("/unit-login")
    public ServerResponse unitLogin(@NotNull @RequestBody User user) {
        return this.userService.login(user.getUsername(), user.getPassword());
    }

    /**
     * @Author 安羽兮
     * @Description 个人用户注册
     * @Date 9:04 2020/11/20
     * @Param [user]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @PostMapping("/register")
    public ServerResponse register(@RequestBody User user) {
        return this.userService.register(user);
    }

    /**
     * @Author 安羽兮
     * @Description 单位用户注册
     * @Date 9:04 2020/11/20
     * @Param [user]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @PostMapping("/unit-register")
    public ServerResponse register(@RequestBody UnitRegisterForm data) {
        return this.userService.unitRegisterForm(data);
    }

    /**
     * @Author 安羽兮
     * @Description 通过IDCard查找用户
     * @Date 10:21 2020/11/20
     * @Param [branchForm]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @PostMapping("/findUserByIdCard")
    public ServerResponse findUserByIdCard(String idcard) {
        return this.userService.findUserByIdCard(idcard);
    }

    /**
     * @Author 安羽兮
     * @Description 添加用户到分公司
     * @Date 10:41 2020/11/20
     * @Param [id 分公司id, userId 用户id]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @PostMapping("/addUserToBranch/{id:\\d+}")
    public ServerResponse addUserToBranch(@PathVariable("id") Long id, Long userId) {
        return this.userService.addUserToBranch(id, userId);
    }

    /**
     * @Author 安羽兮
     * @Description 修改密码
     * @Date 10:33 2020/7/15
     * @Param [changePassword]
     * @Return com.explore.common.ServerResponse
     **/
    @PostMapping("/change-password")
    public ServerResponse changePassword(@NotNull @RequestBody ChangePassword changePassword) {
        return this.userService.changePassword(changePassword);
    }


    /**
     * @Author 安羽兮
     * @Description 上传图片
     * @Date 10:46 2020/11/20
     * @Param [file, prefix 期望图片保存名称前缀]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @PostMapping("/upload")
    public ServerResponse upload(@RequestParam("file") MultipartFile file, String prefix) {
        Const.Role[] roles = Const.Role.values();
        Map<String, String> result = UploadUtils.upload(file, prefix);
        if (null != result)
            return ServerResponse.createBySuccess(result);
        return ServerResponse.createByErrorMessage("上传失败");
    }

    /**
     * 显示单张图片
     */
    @GetMapping("/show/{fileName}")
    public ResponseEntity showPhotos(@PathVariable("fileName") String fileName) {
        return UploadUtils.show(fileName, resourceLoader);
    }
}