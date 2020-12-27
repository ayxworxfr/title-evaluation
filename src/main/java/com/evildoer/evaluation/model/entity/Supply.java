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
public class Supply extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 单位id
     */
    private Long unitId;

    /**
     * 个人身份性质 1-国有企业人员 2-自由职业者
     */
    private Integer property;

    /**
     * 曾用名
     */
    private String oldname;

    /**
     * 工作小结
     */
    private String summary;

    /**
     * 参加工作时间
     */
    private LocalDateTime workTime;

    /**
     * 专业技术工作年限
     */
    private Integer skillAge;

    /**
     * 行政职务
     */
    private Integer position;

    /**
     * 行政职务任命时间
     */
    private LocalDateTime posTime;

    /**
     * 身份证正面
     */
    private String frontUrl;

    /**
     * 身份证反面
     */
    private String reverseUrl;


}
