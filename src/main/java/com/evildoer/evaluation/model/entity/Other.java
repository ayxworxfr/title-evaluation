package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
public class Other extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题", required = true)
    private String title;

    /**
     * 项目扫描件
     */
    @ApiModelProperty(value = "项目扫描件", required = true)
    private String projectUrl;

    private Long evaluationId;


}
