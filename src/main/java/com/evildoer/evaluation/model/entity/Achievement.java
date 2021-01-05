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
public class Achievement extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 业绩名称
     */
    @ApiModelProperty(value = "业绩名称", required = true)
    private String name;

    /**
     * 开始时间
     */
    @ApiModelProperty(value = "开始时间", required = true)
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间", required = true)
    private LocalDateTime endTime;

    /**
     * 级别
     */
    @ApiModelProperty(value = "级别", required = true)
    private String level;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容", required = true)
    private String content;

    /**
     * 完成情况及效果、效益、获何种奖励、专利（最多250字）
     */
    @ApiModelProperty(value = "完成情况", required = true)
    private String situation;

    /**
     * 项目材料扫描件
     */
    @ApiModelProperty(value = "项目材料扫描件", required = true)
    private String dataUrl;

    /**
     * 个人项目任职证明扫描件
     */
    @ApiModelProperty(value = "个人项目任职证明扫描件", required = true)
    private String appointmentUrl;

    /**
     * 项目获奖扫描件
     */
    @ApiModelProperty(value = "项目获奖扫描件", required = true)
    private String awardUrl;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;

    /**
     * 作用
     */
    @ApiModelProperty(value = "作用", required = true)
    private String effect;


}
