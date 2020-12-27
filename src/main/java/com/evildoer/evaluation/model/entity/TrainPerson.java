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
 * @since 2020-12-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TrainPerson extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 材料名称
     */
    private String name;

    /**
     * 材料图片
     */
    private String proveUrl;

    private Long evaluationId;


}
