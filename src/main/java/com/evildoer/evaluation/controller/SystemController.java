package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.User;
import com.evildoer.evaluation.model.form.ChangePassword;
import com.evildoer.evaluation.model.form.LoginForm;
import com.evildoer.evaluation.model.form.UnitRegisterForm;
import com.evildoer.evaluation.service.IUnitService;
import com.evildoer.evaluation.service.IUserService;
import com.evildoer.evaluation.utils.UploadUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
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

    private final IUnitService unitService;

    private final ResourceLoader resourceLoader;

    public SystemController(IUserService userService, IUnitService unitService, ResourceLoader resourceLoader) {
        this.userService = userService;
        this.unitService = unitService;
        this.resourceLoader = resourceLoader;
    }

    @PostMapping("/login")
    @ApiOperation(value = "登录", notes = "评估登录接口", httpMethod = "POST")
    public ServerResponse login(
            @ApiParam(name = "userForm", value = "传入json格式", required = true)
            @NotNull @RequestBody LoginForm loginForm) {
//        //校验验证码
//        //session中的验证码
//        String sessionCaptcha = (String) SecurityUtils.getSubject().getSession().getAttribute(CaptchaController.KEY_CAPTCHA);
//        if (null == captcha || !captcha.equalsIgnoreCase(sessionCaptcha)) {
//            return CommonResult.failed("验证码错误");
//        }
        User user = new User();
        BeanUtils.copyProperties(loginForm, user);

        return this.userService.login(user);
    }


    /**
     * @Author 安羽兮
     * @Description 单位用户登录
     * @Date 9:03 2020/11/20
     * @Param [user]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @ApiOperation(value = "单位登录", notes = "单位登录接口", httpMethod = "POST")
    @PostMapping("/unit-login")
    public ServerResponse unitLogin(
            @ApiParam(name = "userForm", value = "传入json格式", required = true)
            @NotNull @RequestBody LoginForm loginForm) {
        return this.userService.unitLogin(loginForm);
    }

    /**
     * @Author 安羽兮
     * @Description 个人用户注册
     * @Date 9:04 2020/11/20
     * @Param [user]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @ApiOperation(value = "个人用户注册", notes = "个人用户注册接口", httpMethod = "POST")
    @PostMapping("/register")
    public ServerResponse register(
            @ApiParam(name = "user", value = "传入json格式", required = true)
            @RequestBody User user) {
        return this.userService.register(user);
    }

    /**
     * @Author 安羽兮
     * @Description 单位用户注册
     * @Date 9:04 2020/11/20
     * @Param [user]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @ApiOperation(value = "单位用户注册", notes = "单位用户注册接口", httpMethod = "POST")
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
    @ApiOperation(value = "通过IDCard查找用户", notes = "通过IDCard查找用户接口", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "idcard", value = "身份证", required = true, paramType = "form"),
    })
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
    @ApiOperation(value = "添加用户到分公司", notes = "添加用户到分公司接口", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true, paramType = "form"),
    })
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
    @ApiOperation(value = "修改密码", notes = "修改密码", httpMethod = "POST")
    @PostMapping("/change-password")
    public ServerResponse changePassword(
            @ApiParam(name = "changePassword", value = "传入json格式", required = true)
            @NotNull @RequestBody ChangePassword changePassword) {
        return this.userService.changePassword(changePassword);
    }


    /**
     * @Author 安羽兮
     * @Description 上传图片
     * @Date 10:46 2020/11/20
     * @Param [file, prefix 期望图片保存名称前缀]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @ApiOperation(value = "上传图片", notes = "上传图片接口", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "file", value = "文件", required = true, paramType = "form"),
            @ApiImplicitParam(name = "prefix", value = "文件保存前缀", example = "unit", required = true, paramType = "form"),
    })
    @PostMapping("/upload")
    public ServerResponse upload(@RequestParam("file") MultipartFile file, String prefix) {
        Map<String, String> result = UploadUtils.upload(file, prefix);
        if (null != result)
            return ServerResponse.createBySuccess(result);
        return ServerResponse.createByErrorMessage("上传失败");
    }

    /**
     * 显示单张图片
     */
    @ApiOperation(value = "显示单张图片", notes = "显示单张图片接口", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fileName", value = "文件名称", required = true, paramType = "form"),
    })
    @GetMapping("/show/{fileName}")
    public ResponseEntity showPhotos(@PathVariable("fileName") String fileName) {
        return UploadUtils.show(fileName, resourceLoader);
    }
}