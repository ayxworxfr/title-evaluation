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
public class Paper extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 发表时间
     */
    private LocalDateTime publishTime;

    /**
     * 论文类别
     */
    private Long category;

    /**
     * 角色
     */
    private Long role;

    /**
     * 代表作 1:是,  0:否
     */
    private Integer represent;

    /**
     * 论文著作名称
     */
    private String name;

    /**
     * 
论文级别
     */
    private Long level;

    /**
     * 年卷（期）
     */
    private String volume;

    /**
     * 获奖情况经济效益
     */
    private String economy;

    /**
     * 登载刊物名称、刊号
     */
    private String number;

    /**
     * 是否在推荐表上显示此论文、著作
     */
    private Integer display;

    /**
     * 国外权威索引收录
     */
    private Integer foreignLevel;

    /**
     * 论文封面
     */
    private String coverUrl;

    /**
     * 论文目录
     */
    private String catalogUrl;

    /**
     * 论文内容
     */
    private String contentUrl;

    private Long evaluationId;


}
