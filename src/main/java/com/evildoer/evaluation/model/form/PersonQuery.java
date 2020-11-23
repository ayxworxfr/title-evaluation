package com.evildoer.evaluation.model.form;


import com.evildoer.evaluation.common.domain.BasePage;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class PersonQuery extends BasePage {

    @Size(max = 25, message = "用户名id的字符长度不能超过 {max}")
    private Integer personId;

    @Size(max = 25, message = "手机的字符长度不能超过 {max}")
    private String phone;
}
