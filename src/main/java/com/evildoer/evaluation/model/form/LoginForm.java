package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.model.entity.User;
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
    private String captcha;

    // 单位名称
    private String unit;

}

