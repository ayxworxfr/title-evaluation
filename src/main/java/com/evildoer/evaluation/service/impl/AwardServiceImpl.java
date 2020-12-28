package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.AwardMapper;
import com.evildoer.evaluation.model.entity.Award;
import com.evildoer.evaluation.service.IAwardService;
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
public class AwardServiceImpl extends ServiceImpl<AwardMapper, Award> implements IAwardService {

    @Override
    public List<Award> listEvaluation(long evaluation_id) {
        QueryWrapper<Award> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Award::getEvaluationId, evaluation_id);
        List<Award> experiences = list(queryWrapper);
        return  experiences;
    }

    @Override
    public ServerResponse addExperience(Award award) {
        award.setCreateTime(LocalDateTime.now());
        award.setUpdateTime(LocalDateTime.now());
        boolean result = save(award);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
