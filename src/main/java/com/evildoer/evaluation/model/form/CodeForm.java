package com.evildoer.evaluation.model.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * @ClassName CodeForm
 * @Description CodeForm
 * @Author 安羽兮
 * @Date 2020/11/2119:16
 * @Version 1.0
 **/
@Data
public class CodeForm {

    @ApiModelProperty(value = "id", hidden = true, example = "1")
    private Long id;

    @ApiModelProperty(value = "账户", required = false, example = "123")
    @NotNull(message = "账号不能为空！")
    private String account;

    @ApiModelProperty(value = "密码", required = false, example = "123456")
    @NotNull(message = "密码不能为空！")
    private String password;

    /**
     * 评审会名称
     */
    @ApiModelProperty(value = "评审会名称", hidden = true, example = "xxx评审会")
    private String jury;

    @ApiModelProperty(value = "创建时间", required = true, example = "2020-12-12T11:11:11.111Z")
    private LocalDateTime createTime = LocalDateTime.now();

    @ApiModelProperty(value = "失效时间", required = true, example = "2018-12-20T11:11:11.111Z")
    @NotNull(message = "失效时间不能为空")
    private LocalDateTime failureTime;
}
