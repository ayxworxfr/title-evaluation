package com.evildoer.evaluation.model.entity;

import com.evildoer.evaluation.common.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
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
public class Supply extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 单位id
     */
    @ApiModelProperty(value = "单位", required = true)
    private Long unitId;

    /**
     * 个人身份性质 1-国有企业人员 2-自由职业者
     */
    @ApiModelProperty(value = "个人身份性质", required = true)
    private Integer property;

    /**
     * 曾用名
     */
    @ApiModelProperty(value = "曾用名", required = true)
    private String oldname;

    /**
     * 工作小结
     */
    @ApiModelProperty(value = "工作小结", required = true)
    private String summary;

    /**
     * 参加工作时间
     */
    @ApiModelProperty(value = "参加工作时间", required = true)
    private LocalDateTime workTime;

    /**
     * 专业技术工作年限
     */
    @ApiModelProperty(value = "专业技术工作年限", required = true)
    private Integer skillAge;

    /**
     * 行政职务
     */
    @ApiModelProperty(value = "行政职务", required = true)
    private Integer position;

    /**
     * 行政职务任命时间
     */
    @ApiModelProperty(value = "行政职务任命时间", required = true)
    private LocalDateTime posTime;

    /**
     * 身份证正面
     */
    @ApiModelProperty(value = "身份证正面", required = true)
    private String frontUrl;

    /**
     * 身份证反面
     */
    @ApiModelProperty(value = "身份证反面", required = true)
    private String reverseUrl;


}
