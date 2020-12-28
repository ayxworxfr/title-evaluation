package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.TrainPersonMapper;
import com.evildoer.evaluation.model.entity.TrainPerson;
import com.evildoer.evaluation.service.ITrainPersonService;
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
public class TrainPersonServiceImpl extends ServiceImpl<TrainPersonMapper, TrainPerson> implements ITrainPersonService {

    @Override
    public List<TrainPerson> listEvaluation(long evaluation_id) {
        QueryWrapper<TrainPerson> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(TrainPerson::getEvaluationId, evaluation_id);
        List<TrainPerson> experiences = list(queryWrapper);
        return  experiences;
    }

    @Override
    public ServerResponse addExperience(TrainPerson trainPerson) {
        trainPerson.setCreateTime(LocalDateTime.now());
        trainPerson.setUpdateTime(LocalDateTime.now());
        boolean result = save(trainPerson);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
