package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.model.entity.Unit;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @ClassName UnitRegisterForm
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/11/208:57
 * @Version 1.0
 **/
@Data
public class UnitRegisterForm extends Unit {

    // 用户账户
    private String username;

    @NotNull(message = "密码不能为空")
    @Size(max = 25, message = "用户名的字符长度不能超过 {max}")
    private String password;
}
