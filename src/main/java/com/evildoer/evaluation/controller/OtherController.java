package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Other;
import com.evildoer.evaluation.service.IOtherService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
@RestController
@RequestMapping("/evaluation/{evaluation_id:\\d+}/other")
public class OtherController {

    private final IOtherService otherService;

    public OtherController(IOtherService otherService) {
        this.otherService = otherService;
    }

    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/list")
    public ServerResponse list(@PathVariable("evaluation_id") long evaluation_id){
        List<Other> experiences = otherService.listEvaluation(evaluation_id);
        return  ServerResponse.createBySuccess(experiences);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Other other,@PathVariable("evaluation_id") long evaluation_id) {
        other.setEvaluationId(evaluation_id);
        return this.otherService.addExperience(other);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Other other = otherService.getById(id);
        if (null != other) {
            return ServerResponse.createBySuccess(other);
        } else {
            return ServerResponse.createByError();
        }
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @DeleteMapping("/delete/{id:\\d+}")
    public ServerResponse delete(@PathVariable("id") Long id) {
        Boolean result = otherService.removeById(id);
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
                                     @RequestBody Other other) {
        other.setId(id.longValue());
        other.setUpdateTime(LocalDateTime.now());
        boolean result =otherService.updateById(other);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
