package com.evildoer.evaluation.model.form;

import com.evildoer.evaluation.model.entity.BranchOffice;
import lombok.Data;

/**
 * @ClassName BranchForm
 * @Description BranchForm
 * @Author 安羽兮
 * @Date 2020/11/2010:10
 * @Version 1.0
 **/
@Data
public class BranchForm extends BranchOffice {
    
    // 通过员工身份证添加用户到分公司
    private String idcard;
}
