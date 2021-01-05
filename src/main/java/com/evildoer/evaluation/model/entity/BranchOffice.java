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
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class BranchOffice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    // 分公司名称
    @ApiModelProperty(value = "分公司名称", required = true)
    private String name;

    @ApiModelProperty(value = "单位", required = true)
    private Long unitId;

    @ApiModelProperty(value = "用户", required = true)
    private Long userId;

    /**
     * 分公司签章URL
     */
    @ApiModelProperty(value = "分公司签章URL", required = true)
    private String signature;

}
