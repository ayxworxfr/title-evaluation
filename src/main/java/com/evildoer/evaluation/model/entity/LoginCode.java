package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class LoginCode extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "账户", required = true)
    private String account;

    @ApiModelProperty(value = "密码", required = true)
    private String password;

    /**
     * 评审会名称
     */
    @ApiModelProperty(value = "评审会名称", required = true)
    private String jury;

    @ApiModelProperty(value = "失效时间", required = true)
    private LocalDateTime failureTime;
}
