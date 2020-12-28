package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.OtherMapper;
import com.evildoer.evaluation.model.entity.Other;
import com.evildoer.evaluation.service.IOtherService;
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
public class OtherServiceImpl extends ServiceImpl<OtherMapper, Other> implements IOtherService {

    @Override
    public List<Other> listEvaluation(long evaluation_id) {
        QueryWrapper<Other> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Other::getEvaluationId, evaluation_id);
        List<Other> others = list(queryWrapper);
        return  others;
    }

    @Override
    public ServerResponse addExperience(Other other) {
        other.setCreateTime(LocalDateTime.now());
        other.setUpdateTime(LocalDateTime.now());
        boolean result = save(other);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
