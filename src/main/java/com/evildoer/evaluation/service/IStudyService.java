package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Study;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
public interface IStudyService extends IService<Study> {

    ServerResponse addStudy(Study study);

    List<Study> listEvaluation(long evaluation_id);
}
