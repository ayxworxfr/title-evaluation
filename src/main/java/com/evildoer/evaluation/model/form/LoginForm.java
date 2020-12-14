package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.model.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName LoginForm
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/11/208:57
 * @Version 1.0
 **/
@Data
public class LoginForm extends User {

    // 验证码
    @ApiModelProperty(value = "验证码", required = true, example = "4563")
    private String captcha;

    // 单位名称
    @ApiModelProperty(value = "单位名称", required = true, example = "xx公司")
    private String unit;

}

