package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.PaperMapper;
import com.evildoer.evaluation.model.entity.Paper;
import com.evildoer.evaluation.service.IPaperService;
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
public class PaperServiceImpl extends ServiceImpl<PaperMapper, Paper> implements IPaperService {

    @Override
    public List<Paper> listEvaluation(long evaluation_id) {
        QueryWrapper<Paper> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Paper::getEvaluationId, evaluation_id);
        List<Paper> papers = list(queryWrapper);
        return  papers;
    }

    @Override
    public ServerResponse addExperience(Paper paper) {
        paper.setCreateTime(LocalDateTime.now());
        paper.setUpdateTime(LocalDateTime.now());
        boolean result = save(paper);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }
}
