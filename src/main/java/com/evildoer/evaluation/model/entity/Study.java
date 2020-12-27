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
public class Study extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long evaluationId;

    private LocalDateTime graduationTime;

    /**
     * 学历项目
     */
    private String project;

    /**
     * 学历水平
     */
    private String level;

    /**
     * 学历性质
     */
    private String quality;

    /**
     * 毕业学校
     */
    private String school;

    /**
     * 学历照片
     */
    private String proveUrl;

    /**
     * 所学专业
     */
    private String profession;

    /**
     * 证书编号
     */
    private String certificateNumber;


}
