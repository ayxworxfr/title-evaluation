package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.model.entity.Unit;
import com.evildoer.evaluation.model.form.UnitQuery;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface IUnitService extends IService<Unit> {

    Unit getByName(String name);

    PageInfo<Unit> pageByQuery(UnitQuery query);
}
