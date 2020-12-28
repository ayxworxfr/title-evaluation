package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.AbroadMapper;
import com.evildoer.evaluation.model.entity.Abroad;
import com.evildoer.evaluation.service.IAbroadService;
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
public class AbroadServiceImpl extends ServiceImpl<AbroadMapper, Abroad> implements IAbroadService {

    @Override
    public List<Abroad> listEvaluation(long evaluation_id) {
        QueryWrapper<Abroad> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Abroad::getEvaluationId, evaluation_id);
        List<Abroad> abroads = list(queryWrapper);
        return  abroads;
    }

    @Override
    public ServerResponse addExperience(Abroad abroad) {
        abroad.setCreateTime(LocalDateTime.now());
        abroad.setUpdateTime(LocalDateTime.now());
        boolean result = save(abroad);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
