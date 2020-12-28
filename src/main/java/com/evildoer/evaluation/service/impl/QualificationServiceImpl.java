package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.QualificationMapper;
import com.evildoer.evaluation.model.entity.Qualification;
import com.evildoer.evaluation.service.IQualificationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
@Service
public class QualificationServiceImpl extends ServiceImpl<QualificationMapper, Qualification> implements IQualificationService {

    @Override
    public List<Qualification> listEvaluation(long evaluation_id) {
        QueryWrapper<Qualification> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Qualification::getEvaluationId, evaluation_id);
        List<Qualification> qualifications = list(queryWrapper);
        return  qualifications;
    }

    @Override
    public ServerResponse addExperience(Qualification qualification) {
        qualification.setCreateTime(LocalDateTime.now());
        qualification.setUpdateTime(LocalDateTime.now());
        boolean result = save(qualification);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
