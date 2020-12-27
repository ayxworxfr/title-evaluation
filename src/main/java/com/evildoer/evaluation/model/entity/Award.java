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
public class Award extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 等级；1:国家级,2:省部级,3:市厅级,4:县区级,5:单位级,0:其他
     */
    private Integer level;

    /**
     * 授予时间
     */
    private LocalDateTime agrantTime;

    /**
     * 授予机构
     */
    private String awardAgrent;

    /**
     * 内容提要
     */
    private String summary;

    /**
     * 证明材料
     */
    private String proveUrl;

    private Long evaluationId;


}
