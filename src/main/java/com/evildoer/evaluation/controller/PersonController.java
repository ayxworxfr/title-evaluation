package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Person;
import com.evildoer.evaluation.model.form.PersonQuery;
import com.evildoer.evaluation.service.IPersonService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    private final IPersonService personService;

    public PersonController(IPersonService personService) {
        this.personService = personService;
    }

    /**
    *@author pu
    *@data 2020/11/23
    *description:
    */
    @GetMapping("/list")
    public ServerResponse list(){
        PersonQuery query = new PersonQuery();
        return ServerResponse.createBySuccess(personService.pageByQuery(query));
    }


    /**
    *@author pu
    *@data 2020/11/23
    *description:
    */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Person person) {
        return this.personService.addPeron(person);
    }


    /**
    *@author pu
    *@data 2020/11/23
    *description:
    */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Person person = personService.getById(id);
        if (null != person) {
            return ServerResponse.createBySuccess(person);
        } else {
            return ServerResponse.createByError();
        }
    }

    
    /**
    *@author pu
    *@data 2020/11/23
    *description:
    */
    @DeleteMapping("/delete/{person_id:\\d+}")
    public ServerResponse delete(@PathVariable("person_id") Long personId) {
        Boolean result = personService.removeById(personId);
        if (result) {
            return ServerResponse.createBySuccess("删除成功");
        } else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }

    
    /**
    *@author pu
    *@data 2020/11/23
    *description:
    */
    @PutMapping("/{id:\\d+}")
    public ServerResponse updateById(@PathVariable("id") Integer id,
                                     @RequestBody Person person) {
        person.setId(id.longValue());
        person.setUpdateTime(LocalDateTime.now());
        boolean result = personService.updateById(person);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }
}
