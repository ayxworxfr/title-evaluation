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
public class Unit extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 单位名称
     **/
    @ApiModelProperty(value = "单位名称", required = true)
    private String name;

    /**
     * 单位工作人员
     */
    @ApiModelProperty(value = "单位工作人员", required = true)
    private Long userId;

    /**
     * 社会统一信用代码
     */
    @ApiModelProperty(value = "社会统一信用代码", required = true)
    private String account;

    @ApiModelProperty(value = "单位邮件", required = true)
    private String email;

    /**
     * 单位地址
     */
    @ApiModelProperty(value = "单位地址", required = true)
    private String address;

    /**
     * 单位所在地
     */
    @ApiModelProperty(value = "单位所在地", required = true)
    private String position;

    /**
     * 营业执照图片URL
     */
    @ApiModelProperty(value = "营业执照图片URL", required = true)
    private String license;

    /**
     * 手持身份证照片URL
     */
    @ApiModelProperty(value = "手持身份证照片URL", required = true)
    private String image;

    /**
     * 法人姓名
     */
    @ApiModelProperty(value = "法人姓名", required = true)
    private String legalPerson;

    /**
     * 单位级别 1-区属
     */
    @ApiModelProperty(value = "单位级别", required = true)
    private Integer level;

    /**
     * 单位性质 1-公有 2非公
     */
    @ApiModelProperty(value = "单位性质", required = true)
    private Integer property;

    /**
     * 单位行业 1-服务页
     */
    @ApiModelProperty(value = "单位行业", required = true)
    private Integer industry;

    /**
     * 单位委托人
     */
    @ApiModelProperty(value = "单位委托人", required = true)
    private String principal;

    /**
     * 签章URL
     */
    @ApiModelProperty(value = "签章", required = true)
    private String signature;


}
