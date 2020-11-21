package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.LoginCode;
import com.evildoer.evaluation.model.form.CodeForm;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface ILoginCodeService extends IService<LoginCode> {

    ServerResponse loginByCode(CodeForm code);

    ServerResponse removeByCode(Long code);
}
