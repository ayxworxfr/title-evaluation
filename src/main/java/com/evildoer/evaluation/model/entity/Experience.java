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
 * @since 2020-12-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Experience extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;

    /**
     * 事件
     */
    @ApiModelProperty(value = "事件", required = true)
    private String event;

    /**
     * 工作单位
     */
    @ApiModelProperty(value = "工作单位", required = true)
    private String unit;

    /**
     * 职位
     */
    @ApiModelProperty(value = "职位", required = true)
    private String position;

    /**
     * 成就
     */
    @ApiModelProperty(value = "成就", required = true)
    private String achievement;

    /**
     * 截止时间
     */
    @ApiModelProperty(value = "截止时间", required = true)
    private LocalDateTime deadline;

    /**
     * 证明材料
     */
    @ApiModelProperty(value = "证明材料", required = true)
    private String proveUrl;

    /**
     * 证明人
     */
    @ApiModelProperty(value = "证明人", required = true)
    private String witness;


}
