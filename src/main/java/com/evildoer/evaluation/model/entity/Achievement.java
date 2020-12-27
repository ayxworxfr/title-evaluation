package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
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
    private String name;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 级别
     */
    private String level;

    /**
     * 内容
     */
    private String content;

    /**
     * 完成情况及效果、效益、获何种奖励、专利（最多250字）
     */
    private String situation;

    /**
     * 项目材料扫描件
     */
    private String dataUrl;

    /**
     * 个人项目任职证明扫描件
     */
    private String appointmentUrl;

    /**
     * 项目获奖扫描件
     */
    private String awardUrl;

    private Long evaluationId;

    /**
     * 作用
     */
    private String effect;


}
