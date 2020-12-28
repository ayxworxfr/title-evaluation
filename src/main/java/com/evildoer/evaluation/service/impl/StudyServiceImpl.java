package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.StudyMapper;
import com.evildoer.evaluation.model.entity.Study;
import com.evildoer.evaluation.service.IStudyService;
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
public class StudyServiceImpl extends ServiceImpl<StudyMapper, Study> implements IStudyService {

    @Override
    public ServerResponse addStudy(Study study) {
        study.setCreateTime(LocalDateTime.now());
        study.setUpdateTime(LocalDateTime.now());
        boolean result = save(study);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }

    @Override
    public List<Study> listEvaluation(long evaluation_id) {
        QueryWrapper<Study> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Study::getEvaluationId, evaluation_id);
        List<Study> studyList = list(queryWrapper);
        return  studyList;
    }
}
