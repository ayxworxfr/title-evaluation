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
public class Paper extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 发表时间
     */
    @ApiModelProperty(value = "发表时间", required = true)
    private LocalDateTime publishTime;

    /**
     * 论文类别
     */
    @ApiModelProperty(value = "论文类别", required = true)
    private Long category;

    /**
     * 角色
     */
    @ApiModelProperty(value = "角色", required = true)
    private Long role;

    /**
     * 代表作 1:是,  0:否
     */
    @ApiModelProperty(value = "代表作", required = true)
    private Integer represent;

    /**
     * 论文著作名称
     */
    @ApiModelProperty(value = "论文著作名称", required = true)
    private String name;

    /**
     * 论文级别
     */
    @ApiModelProperty(value = "论文级别", required = true)
    private Long level;

    /**
     * 年卷（期）
     */
    @ApiModelProperty(value = "年卷", required = true)
    private String volume;

    /**
     * 获奖情况经济效益
     */
    @ApiModelProperty(value = "获奖情况经济效益", required = true)
    private String economy;

    /**
     * 登载刊物名称、刊号
     */
    @ApiModelProperty(value = "登载刊物名称、刊号", required = true)
    private String number;

    /**
     * 是否在推荐表上显示此论文、著作
     */
    @ApiModelProperty(value = "是否在推荐表上显示此论文、著作", required = true)
    private Integer display;

    /**
     * 国外权威索引收录
     */
    @ApiModelProperty(value = "国外权威索引收录", required = true)
    private Integer foreignLevel;

    /**
     * 论文封面
     */
    @ApiModelProperty(value = "论文封面", required = true)
    private String coverUrl;

    /**
     * 论文目录
     */
    @ApiModelProperty(value = "论文目录", required = true)
    private String catalogUrl;

    /**
     * 论文内容
     */
    @ApiModelProperty(value = "论文内容", required = true)
    private String contentUrl;

    @ApiModelProperty(hidden = true)
    private Long evaluationId;


}
