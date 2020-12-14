package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@Data
@ApiModel(description = "用户类")
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @ApiModelProperty(value = "用户名", required = true, example = "admin")
    private String username;

    @NotNull
    @ApiModelProperty(value = "密码", required = true, example = "123456")
    private String password;

    @ApiModelProperty(value = "个人账户id", example = "111111", hidden = true)
    private Long personId;

    /**
     * 1-个人账户 2-单位账户
     */
    @ApiModelProperty(value = "账户类型", hidden = true, example = "1")
    private Integer type;

    /**
     * 隶属单位
     */
    @ApiModelProperty(value = "隶属单位id", hidden = true, example = "1")
    private Long unitId;

    /**
     * 隶属分公司
     */
    @ApiModelProperty(value = "隶属分公司id", hidden = true, example = "1")
    private Long branchId;

    @ApiModelProperty(value = "状态", example = "1")
    private Integer status;


}
