package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.common.domain.BasePage;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * @ClassName UnitQuery
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/11/2119:39
 * @Version 1.0
 **/
@Data
public class UnitQuery extends BasePage {

    @Size(max = 25, message = "单位名称的字符长度不能超过 {max}")
    private String name;

    @Size(max = 25, message = "角色名称的字符长度不能超过 {max}")
    private String account;

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
}
