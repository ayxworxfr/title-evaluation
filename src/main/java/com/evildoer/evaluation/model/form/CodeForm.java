package com.evildoer.evaluation.model.form;

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

    private Long id;

    @NotNull(message = "账号不能为空！")
    private String account;

    @NotNull(message = "密码不能为空！")
    private String password;

    /**
     * 评审会名称
     */
    private String jury;

    private LocalDateTime createTime = LocalDateTime.now();

    @NotNull(message = "失效时间不能为空")
    private LocalDateTime failureTime;
}
