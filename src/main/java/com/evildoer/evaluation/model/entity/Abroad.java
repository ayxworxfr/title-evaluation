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
public class Abroad extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;

    /**
     * 工作单位
     */
    @ApiModelProperty(value = "工作单位", required = true, example = "xx部门")
    private String unit;

    /**
     * 职务岗位
     */
    @ApiModelProperty(value = "职务岗位", required = true, example = "xx职位")
    private String job;

    /**
     * 工作内容
     */
    @ApiModelProperty(value = "工作内容", required = true)
    private String content;

    /**
     * 辅助证明材料
     */
    @ApiModelProperty(value = "工作内容", required = true)
    private String proveUrl;

    @ApiModelProperty(value = "工作内容", hidden = true)
    private Long evaluationId;


}
