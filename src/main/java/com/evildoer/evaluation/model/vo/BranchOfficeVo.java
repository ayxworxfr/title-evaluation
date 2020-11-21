package com.evildoer.evaluation.model.vo;

import com.evildoer.evaluation.model.entity.BranchOffice;
import com.evildoer.evaluation.model.entity.Unit;
import lombok.Data;

/**
 * @ClassName BranchOfficeVo
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/11/2119:57
 * @Version 1.0
 **/
@Data
public class BranchOfficeVo extends BranchOffice {
    private Unit unit;
}
