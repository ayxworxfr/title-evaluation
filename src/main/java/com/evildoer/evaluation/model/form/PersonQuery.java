package com.evildoer.evaluation.model.form;


import com.evildoer.evaluation.common.domain.BasePage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class PersonQuery extends BasePage {

    @ApiModelProperty(value = "个人账户id", required = false, example = "1")
    @Size(max = 25, message = "个人账户id的字符长度不能超过 {max}")
    private Integer personId;

    @ApiModelProperty(value = "电话号码", required = false, example = "15745635523")
    @Size(max = 25, message = "手机的字符长度不能超过 {max}")
    private String phone;
}
