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
public class Evaluation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private LocalDateTime year;

    /**
     * 数据报送来源
     */
    private String source;

    /**
     * 申报级别
     */
    private Integer level;

    private String jury;

    private Long supplyId;

    private Integer status;


}
