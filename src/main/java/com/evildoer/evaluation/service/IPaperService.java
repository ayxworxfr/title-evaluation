package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Paper;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
public interface IPaperService extends IService<Paper> {

    List<Paper> listEvaluation(long evaluation_id);

    ServerResponse addExperience(Paper paper);
}
