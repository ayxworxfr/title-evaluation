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
public class Qualification extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 资格名称
     */
    @ApiModelProperty(value = "资格名称", required = true)
    private String name;

    /**
     * 取得时间
     */
    @ApiModelProperty(value = "取得时间", required = true)
    private LocalDateTime getTime;

    /**
     * 批准机关
     */
    @ApiModelProperty(value = "批准机关", required = true)
    private String approval;

    /**
     * 专业名称
     */
    @ApiModelProperty(value = "专业名称", required = true)
    private String professional;

    /**
     * 证书编号
     */
    @ApiModelProperty(value = "证书编号", required = true)
    private String number;

    /**
     * 辅助证明材料
     */
    @ApiModelProperty(value = "辅助证明材料", required = true)
    private String proveUrl;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;


}
