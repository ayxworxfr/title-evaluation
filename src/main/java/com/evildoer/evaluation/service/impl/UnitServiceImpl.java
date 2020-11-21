package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.dao.UnitMapper;
import com.evildoer.evaluation.model.entity.Unit;
import com.evildoer.evaluation.model.form.UnitQuery;
import com.evildoer.evaluation.service.IUnitService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

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
public class UnitServiceImpl extends ServiceImpl<UnitMapper, Unit> implements IUnitService {

    @Override
    public PageInfo<Unit> pageByQuery(UnitQuery query) {
        LambdaQueryWrapper<Unit> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotEmpty(query.getAccount()))
            queryWrapper.like(Unit::getAccount, query.getAccount());
        if (StringUtils.isNotEmpty(query.getName()))
            queryWrapper.like(Unit::getName, query.getName());
        PageHelper.startPage(query.getPage(), query.getPageSize());
        List<Unit> list = this.list(queryWrapper);
        return new PageInfo<>(list);
    }
}
