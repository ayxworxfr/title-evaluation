package com.evildoer.evaluation.model.vo;


import com.evildoer.evaluation.model.entity.Evaluation;
import com.evildoer.evaluation.model.entity.Person;
import com.evildoer.evaluation.model.entity.Supply;
import lombok.Data;

@Data
public class EvaluationVo extends Evaluation {
    private Supply supply;

    private Person person;
}
