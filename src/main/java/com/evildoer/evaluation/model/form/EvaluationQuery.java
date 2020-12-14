package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.common.domain.BasePage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;
import java.time.Year;


@Data
public class EvaluationQuery extends BasePage {

    @ApiModelProperty(value = "年度", required = false, example = "2019")
    @Size(max = 25, message = "年度的字符长度不能超过 {max}")
    private Year year;

    @ApiModelProperty(value = "等级", required = false, example = "")
    @Size(max = 25, message = "等级字符长度不能超过 {max}")
    private Integer level;

    @ApiModelProperty(value = "状态", required = false, example = "1")
    @Size(max = 25, message = "状态的字符长度不能超过 {max}")
    private Integer status;
}
