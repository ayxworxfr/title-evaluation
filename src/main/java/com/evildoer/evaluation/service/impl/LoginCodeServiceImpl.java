package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.dao.LoginCodeMapper;
import com.evildoer.evaluation.model.entity.LoginCode;
import com.evildoer.evaluation.service.ILoginCodeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@Service
public class LoginCodeServiceImpl extends ServiceImpl<LoginCodeMapper, LoginCode> implements ILoginCodeService {

}
