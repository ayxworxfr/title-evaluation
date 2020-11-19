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
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private Long personId;

    /**
     * 1-个人账户 2-单位账户
     */
    private Integer type;

    /**
     * 隶属单位
     */
    private Long unitId;

    /**
     * 隶属分公司
     */
    private Long branchId;

    private Integer status;


}
