package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.LoginCode;
import com.evildoer.evaluation.model.form.CodeForm;
import com.evildoer.evaluation.service.ILoginCodeService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/login-code")
public class LoginCodeController {

    private final ILoginCodeService loginCodeService;

    public LoginCodeController(ILoginCodeService loginCodeService) {
        this.loginCodeService = loginCodeService;
    }

    /**
     * @Author 安羽兮
     * @Description 添加用户
     * @Date 10:04 2020/7/15
     * @Param [userId]
     * @Return com.explore.common.ServerResponse
     **/
    @PostMapping("/add")
    public ServerResponse add(@NotNull @RequestBody CodeForm code) {
        LoginCode loginCode = new LoginCode();
        BeanUtils.copyProperties(code, loginCode);
        boolean result = this.loginCodeService.saveOrUpdate(loginCode);
        if (result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByErrorMessage("添加失败！");
    }

    /**
     * @Author 安羽兮
     * @Description 通过code登录
     * @Date 13:42 2020/7/16
     * @Param [id]
     * @Return com.explore.common.ServerResponse
     **/
    @GetMapping("/login")
    public ServerResponse loginByCode(@RequestBody CodeForm code) {
        return loginCodeService.loginByCode(code);
    }

    @DeleteMapping("/delete/{code:\\d+}")
    public ServerResponse delete(@PathVariable("code") Long code) {
        return loginCodeService.removeByCode(code);
    }
}
