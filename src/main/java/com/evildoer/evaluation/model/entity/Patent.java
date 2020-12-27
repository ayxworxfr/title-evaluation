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
public class Patent extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 专利名称
     */
    private String name;

    /**
     * 类别,1:发明,2:实用新型,3:外观设计
     */
    private Integer type;

    /**
     * 取得时间
     */
    private LocalDateTime getTime;

    /**
     * 专利介绍
     */
    private String introduce;

    /**
     * 辅助证明材料
     */
    private String proveUrl;

    private Long evaluationId;


}
