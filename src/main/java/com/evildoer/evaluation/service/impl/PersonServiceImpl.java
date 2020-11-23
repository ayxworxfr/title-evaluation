package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.PersonMapper;
import com.evildoer.evaluation.model.entity.Person;
import com.evildoer.evaluation.model.form.PersonQuery;
import com.evildoer.evaluation.service.IPersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {



    @Override
    public PageInfo<Person> pageByQuery(PersonQuery query) {
        LambdaQueryWrapper<Person> queryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotEmpty(query.getPhone())){
            queryWrapper.like(Person::getPhone, query.getPhone());
        }
        if(query.getPersonId()!=-1){
            queryWrapper.like(Person::getId, query.getPersonId());
        }
        PageHelper.startPage(query.getPage(), query.getPageSize());
        List<Person> list = this.list(queryWrapper);
        return new PageInfo<>(list);
    }

    @Override
    public ServerResponse addPeron(Person person) {
        person.setCreateTime(LocalDateTime.now());
        person.setUpdateTime(LocalDateTime.now());
        boolean result = save(person);
        if(result)
            return ServerResponse.createBySuccess("添加成功");
        return ServerResponse.createByError();
    }


}
