package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.common.domain.BasePage;
import lombok.Data;

import javax.validation.constraints.Size;
import java.time.Year;


@Data
public class EvaluationQuery extends BasePage {
    @Size(max = 25, message = "年度的字符长度不能超过 {max}")
    private Year year;

    @Size(max = 25, message = "等级字符长度不能超过 {max}")
    private Integer level;

    @Size(max = 25, message = "状态的字符长度不能超过 {max}")
    private Integer status;
}
