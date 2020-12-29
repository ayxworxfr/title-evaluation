package com.evildoer.evaluation.model.vo;


import com.evildoer.evaluation.model.entity.Evaluation;
import com.evildoer.evaluation.model.entity.Supply;
import com.evildoer.evaluation.model.entity.Unit;
import lombok.Data;

@Data
public class SupplyVo  extends Supply {

    private Evaluation evaluation;

    private Unit unit;
}
