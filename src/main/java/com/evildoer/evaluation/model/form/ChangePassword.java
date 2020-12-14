package com.evildoer.evaluation.model.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @ClassName ChangePassword
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/7/1510:15
 * @Version 1.0
 **/
@Data
public class ChangePassword {

    @ApiModelProperty(value = "用户名", required = true, example = "admin")
    @NotBlank(message = "用户名不能为空")
    @Size(max = 25, message = "用户名的字符长度不能超过 {max}")
    private String username;

    @ApiModelProperty(value = "旧密码", required = true, example = "123456")
    @NotBlank(message = "旧密码不能为空")
    @Size(max = 25, message = "旧密码的字符长度不能超过 {max}")
    private String oldPassword;

    @ApiModelProperty(value = "新密码", required = true, example = "123123")
    @NotBlank(message = "新密码不能为空")
    @Size(max = 25, message = "新密码的字符长度不能超过 {max}")
    private String newPassword;
}
