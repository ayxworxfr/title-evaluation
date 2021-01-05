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
public class Study extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;

    @ApiModelProperty(value = "毕业时间", required = true)
    private LocalDateTime graduationTime;

    /**
     * 学历项目
     */
    @ApiModelProperty(value = "学历项目", required = true)
    private String project;

    /**
     * 学历水平 （学位）
     */
    @ApiModelProperty(value = "学历水平", required = true)
    private String level;

    /**
     * 学历性质 （学历）
     */
    @ApiModelProperty(value = "学历性质", required = true)
    private String quality;

    /**
     * 毕业学校
     */
    @ApiModelProperty(value = "毕业学校", required = true)
    private String school;

    /**
     * 学历照片(毕业时间)
     */
    @ApiModelProperty(value = "学历照片", required = true)
    private String proveUrl;

    /**
     * 所学专业
     */
    @ApiModelProperty(value = "所学专业", required = true)
    private String profession;

    /**
     * 证书编号
     */
    @ApiModelProperty(value = "证书编号", required = true)
    private String certificateNumber;


}
