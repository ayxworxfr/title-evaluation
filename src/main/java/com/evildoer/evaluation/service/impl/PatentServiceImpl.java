package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.PatentMapper;
import com.evildoer.evaluation.model.entity.Patent;
import com.evildoer.evaluation.service.IPatentService;
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
public class PatentServiceImpl extends ServiceImpl<PatentMapper, Patent> implements IPatentService {

    @Override
    public List<Patent> listEvaluation(long evaluation_id) {
        QueryWrapper<Patent> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Patent::getEvaluationId, evaluation_id);
        List<Patent> patents = list(queryWrapper);
        return  patents;
    }

    @Override
    public ServerResponse addExperience(Patent patent) {
        patent.setCreateTime(LocalDateTime.now());
        patent.setUpdateTime(LocalDateTime.now());
        boolean result = save(patent);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
