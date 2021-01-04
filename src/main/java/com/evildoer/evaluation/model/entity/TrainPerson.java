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
public class TrainPerson extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 材料名称
     */
    @ApiModelProperty(value = "材料名称", required = true)
    private String name;

    /**
     * 材料图片
     */
    @ApiModelProperty(value = "材料图片", required = true)
    private String proveUrl;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;


}
