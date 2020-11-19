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
public class BranchOffice extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private Long unitId;

    private Long userId;

    /**
     * 分公司签章URL
     */
    private String signature;


}
