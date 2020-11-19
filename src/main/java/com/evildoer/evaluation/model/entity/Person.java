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
public class Person extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String idcard;

    private String phone;

    private String email;

    private Integer status;

    /**
     * 民族
     */
    private Integer nation;

    /**
     * 政治面貌
     */
    private Integer political;

    private Integer sex;

    /**
     * 出生年月
     */
    private String birthDay;

    private String birthPlace;

    /**
     * 档案所在地
     */
    private String filePlace;


}
