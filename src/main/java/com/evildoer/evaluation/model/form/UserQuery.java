package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.common.domain.BasePage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * @ClassName UserQuery
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/7/1510:23
 * @Version 1.0
 **/
@Data
public class UserQuery extends BasePage {

    @Size(max = 25, message = "用户名的字符长度不能超过 {max}")
    @ApiModelProperty(value = "用户名", required = false, example = "admin")
    private String username;
}
