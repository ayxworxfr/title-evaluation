package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.ExperienceMapper;
import com.evildoer.evaluation.model.entity.Experience;
import com.evildoer.evaluation.service.IExperienceService;
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
public class ExperienceServiceImpl extends ServiceImpl<ExperienceMapper, Experience> implements IExperienceService {

    @Override
    public List<Experience> listEvaluation(long evaluation_id) {
        QueryWrapper<Experience> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Experience::getEvaluationId, evaluation_id);
        List<Experience> experiences = list(queryWrapper);
        return  experiences;
    }

    @Override
    public ServerResponse addExperience(Experience experience) {
        experience.setCreateTime(LocalDateTime.now());
        experience.setUpdateTime(LocalDateTime.now());
        boolean result = save(experience);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
