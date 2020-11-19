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
public class Unit extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    /**
     * 单位工作人员
     */
    private Long userId;

    /**
     * 社会统一信用代码
     */
    private String account;

    private String email;

    /**
     * 单位地址
     */
    private String address;

    /**
     * 单位所在地
     */
    private String position;

    /**
     * 营业执照图片URL
     */
    private String license;

    /**
     * 手持身份证照片URL
     */
    private String image;

    /**
     * 法人姓名
     */
    private String legalPerson;

    /**
     * 单位级别 1-区属
     */
    private Integer level;

    /**
     * 单位性质 1-公有 2非公
     */
    private Integer property;

    /**
     * 单位行业 1-服务页
     */
    private Integer industry;

    /**
     * 单位委托人
     */
    private String principal;

    /**
     * 签章URL
     */
    private String signature;


}
