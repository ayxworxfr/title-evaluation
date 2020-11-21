package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.LoginCodeMapper;
import com.evildoer.evaluation.model.entity.LoginCode;
import com.evildoer.evaluation.model.form.CodeForm;
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

    @Override
    public ServerResponse loginByCode(CodeForm code) {
        LambdaQueryWrapper<LoginCode> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(LoginCode::getAccount, code.getAccount());
        queryWrapper.ge(LoginCode::getFailureTime, code.getFailureTime());
        LoginCode loginCode = this.getOne(queryWrapper);
        if (null == loginCode)
            return ServerResponse.createByErrorMessage("登录失败！");
        if (loginCode.getFailureTime().isAfter(code.getFailureTime()))
            return ServerResponse.createByErrorMessage("账号已经过期，请联系管理员！");
        return ServerResponse.createBySuccess();
    }

    @Override
    public ServerResponse removeByCode(Long code) {
        LambdaQueryWrapper<LoginCode> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(LoginCode::getAccount, code);
        boolean result = this.remove(queryWrapper);
        if (result)
            return ServerResponse.createBySuccess("删除成功");
        return ServerResponse.createByErrorMessage("删除失败！");
    }
}
