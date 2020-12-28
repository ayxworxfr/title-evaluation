package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.AchievementMapper;
import com.evildoer.evaluation.model.entity.Achievement;
import com.evildoer.evaluation.service.IAchievementService;
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
public class AchievementServiceImpl extends ServiceImpl<AchievementMapper, Achievement> implements IAchievementService {

    @Override
    public List<Achievement> listEvaluation(long evaluation_id) {
        QueryWrapper<Achievement> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Achievement::getEvaluationId, evaluation_id);
        List<Achievement> achievements = list(queryWrapper);
        return  achievements;
    }

    @Override
    public ServerResponse addExperience(Achievement achievement) {
        achievement.setCreateTime(LocalDateTime.now());
        achievement.setUpdateTime(LocalDateTime.now());
        boolean result = save(achievement);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
