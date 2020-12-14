package com.evildoer.evaluation.common.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName PageBase
 * @Description TODO
 * @Author 安羽兮
 * @Date 2019/12/315:52
 * @Version 1.0
 **/
@Data
public class BasePage implements Serializable {

    private static final long serialVersionUID = -4869594085374385813L;

    /**
     * 总数
     */
    @ApiModelProperty(value = "总数", hidden = true, example = "0")
    private long total = 0;
    /**
     * 每页显示条数，默认 10
     */
    @ApiModelProperty(value = "每页显示条数", hidden = true, example = "10")
    private int pageSize = 10;

    /**
     * 当前页
     */
    @ApiModelProperty(value = "当前页", hidden = true, example = "1")
    private int page = 1;
}
