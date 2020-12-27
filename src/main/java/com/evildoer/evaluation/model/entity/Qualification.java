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
public class Qualification extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 资格名称
     */
    private String name;

    /**
     * 取得时间
     */
    private LocalDateTime getTime;

    /**
     * 批准机关
     */
    private String approval;

    /**
     * 专业名称
     */
    private String professional;

    /**
     * 证书编号
     */
    private String number;

    /**
     * 辅助证明材料
     */
    private String proveUrl;

    private Long evaluationId;


}
