package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Award;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
public interface IAwardService extends IService<Award> {

    List<Award> listEvaluation(long evaluation_id);

    ServerResponse addExperience(Award award);
}
