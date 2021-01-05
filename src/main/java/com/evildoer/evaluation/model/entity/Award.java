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
public class Award extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称", required = true)
    private String name;

    /**
     * 等级；1:国家级,2:省部级,3:市厅级,4:县区级,5:单位级,0:其他
     */
    @ApiModelProperty(value = "等级", required = true)
    private Integer level;

    /**
     * 授予时间
     */
    @ApiModelProperty(value = "授予时间", required = true)
    private LocalDateTime agrantTime;

    /**
     * 授予机构
     */
    @ApiModelProperty(value = "授予机构", required = true)
    private String awardAgrent;

    /**
     * 内容提要
     */
    @ApiModelProperty(value = "内容提要", required = true)
    private String summary;

    /**
     * 证明材料
     */
    @ApiModelProperty(value = "证明材料", required = true)
    private String proveUrl;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;


}
