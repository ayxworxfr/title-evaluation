package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Evaluation;
import com.evildoer.evaluation.model.form.EvaluationQuery;
import com.evildoer.evaluation.model.vo.EvaluationVo;
import com.github.pagehelper.PageInfo;

import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface IEvaluationService extends IService<Evaluation> {

    PageInfo<EvaluationVo> pageByQuery(EvaluationQuery query) ;

    ServerResponse addEvaluation(Evaluation evaluation);
}
