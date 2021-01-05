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
public class Evaluation extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户", required = true)
    private Long userId;

    @ApiModelProperty(value = "年份", required = true)
    private LocalDateTime year;

    /**
     * 数据报送来源
     */
    @ApiModelProperty(value = "数据报送来源", required = true)
    private String source;

    /**
     * 申报级别
     */
    @ApiModelProperty(value = "申报级别", required = true)
    private Integer level;

    @ApiModelProperty(value = "评审团", required = true)
    private String jury;

    @ApiModelProperty(hidden = true)
    private Long supplyId;

    @ApiModelProperty(value = "状态", hidden = true)
    private Integer status;


}
