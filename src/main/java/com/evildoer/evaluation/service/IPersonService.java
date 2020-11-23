package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Person;
import com.evildoer.evaluation.model.form.PersonQuery;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface IPersonService extends IService<Person> {

    PageInfo<Person> pageByQuery(PersonQuery query);

    ServerResponse addPeron(Person person);
}
