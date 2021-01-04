package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    @ApiModelProperty(value = "身份证", required = true)
    private String idcard;

    @ApiModelProperty(value = "电话号码", required = true)
    private String phone;

    @ApiModelProperty(value = "邮件", required = true)
    private String email;

    @ApiModelProperty(value = "状态", required = true)
    private Integer status;

    /**
     * 民族
     */
    @ApiModelProperty(value = "民族", required = true)
    private Integer nation;

    /**
     * 政治面貌
     */
    @ApiModelProperty(value = "政治面貌", required = true)
    private Integer political;

    @ApiModelProperty(value = "性别", required = true)
    private Integer sex;

    /**
     * 出生年月
     */
    @ApiModelProperty(value = "出生年月", required = true)
    private String birthDay;

    @ApiModelProperty(value = "出生地点", required = true)
    private String birthPlace;

    /**
     * 档案所在地
     */
    @ApiModelProperty(value = "档案所在地", required = true)
    private String filePlace;


}
