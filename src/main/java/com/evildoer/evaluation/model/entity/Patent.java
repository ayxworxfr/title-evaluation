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
public class Patent extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 专利名称
     */
    @ApiModelProperty(value = "专利名称", required = true)
    private String name;

    /**
     * 类别,1:发明,2:实用新型,3:外观设计
     */
    @ApiModelProperty(value = "类别", required = true)
    private Integer type;

    /**
     * 取得时间
     */
    @ApiModelProperty(value = "取得时间", required = true)
    private LocalDateTime getTime;

    /**
     * 专利介绍
     */
    @ApiModelProperty(value = "专利介绍", required = true)
    private String introduce;

    /**
     * 辅助证明材料
     */
    @ApiModelProperty(value = "辅助证明材料", required = true)
    private String proveUrl;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;


}
