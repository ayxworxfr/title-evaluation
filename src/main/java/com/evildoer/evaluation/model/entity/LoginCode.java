package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
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

    private String account;

    private String password;

    /**
     * 评审会名称
     */
    private String jury;

    private LocalDateTime failureTime;
}
