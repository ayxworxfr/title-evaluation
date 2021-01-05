package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.EvaluationMapper;
import com.evildoer.evaluation.model.entity.Evaluation;
import com.evildoer.evaluation.model.entity.Supply;
import com.evildoer.evaluation.model.form.EvaluationQuery;
import com.evildoer.evaluation.model.vo.EvaluationVo;
import com.evildoer.evaluation.service.IEvaluationService;
import com.evildoer.evaluation.service.ISupplyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@Service
public class EvaluationServiceImpl extends ServiceImpl<EvaluationMapper, Evaluation> implements IEvaluationService {

    private final ISupplyService supplyService;

    public EvaluationServiceImpl(ISupplyService supplyService) {
        this.supplyService = supplyService;
    }

    @Override
    public PageInfo<EvaluationVo> pageByQuery(EvaluationQuery query){
        LambdaQueryWrapper<Evaluation> queryWrapper = new LambdaQueryWrapper<>();
        if (query.getYear()!=null){
            queryWrapper.like(Evaluation::getYear, query.getYear());
        }
        if(query.getLevel()!=-1){
            queryWrapper.like(Evaluation::getLevel, query.getLevel());
        }
        if(query.getStatus()!=-1){
            queryWrapper.like(Evaluation::getStatus, query.getStatus());
        }
        if(query.getUserId()!=-1){
            queryWrapper.eq(Evaluation::getUserId,query.getUserId());
        }

        PageHelper.startPage(query.getPage(), query.getPageSize());
        List<Evaluation> list = this.list(queryWrapper);
        List<EvaluationVo> lists = convert(list);
        return new PageInfo<>(lists);
    }

    @Override
    public ServerResponse addEvaluation(Evaluation evaluation) {
        evaluation.setCreateTime(LocalDateTime.now());
        evaluation.setUpdateTime(LocalDateTime.now());
        Supply supply = new Supply();
        supply.setCreateTime(LocalDateTime.now());
        if(supplyService.save(supply)) {
            QueryWrapper<Supply> queryWrapper = new QueryWrapper<>();
            queryWrapper.orderByDesc("id");
            queryWrapper.last("limit 0,1");
            evaluation.setSupplyId(supplyService.getOne(queryWrapper).getId());
        }
        boolean result = save(evaluation);
        QueryWrapper<Evaluation> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Evaluation::getUserId,evaluation.getUserId());
        queryWrapper.orderByDesc("id");
        queryWrapper.last("limit 0,1");
        Evaluation data = this.getOne(queryWrapper);
        if(result)
            return ServerResponse.createBySuccess(data);
        return ServerResponse.createByError();
    }

    public List<EvaluationVo> convert(List<Evaluation> list){
        List<EvaluationVo> evaluationVos = new ArrayList<>();
        for(Evaluation vo: list){
            EvaluationVo evaluationVo = new EvaluationVo();
            BeanUtils.copyProperties(vo,evaluationVo);
            evaluationVo.setSupply(supplyService.getById(vo.getSupplyId()));
            evaluationVos.add(evaluationVo);
        }
        return evaluationVos;
    }

}
