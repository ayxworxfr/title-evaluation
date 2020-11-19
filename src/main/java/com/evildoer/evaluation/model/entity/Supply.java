package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
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
public class Supply extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 特长
     */
    private String specialty;

    /**
     * 奖惩
     */
    private String rewards;

    /**
     * 经历
     */
    private String experience;

    /**
     * 工作小结
     */
    private String summary;


}
