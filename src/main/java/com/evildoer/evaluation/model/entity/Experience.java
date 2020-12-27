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
 * @since 2020-12-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Experience extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long evaluationId;

    /**
     * 事件
     */
    private String event;

    /**
     * 工作单位
     */
    private String unit;

    /**
     * 职位
     */
    private String position;

    /**
     * 成就
     */
    private String achievement;

    /**
     * 截止时间
     */
    private LocalDateTime deadline;

    /**
     * 证明材料
     */
    private String proveUrl;

    /**
     * 证明人
     */
    private String witness;


}
