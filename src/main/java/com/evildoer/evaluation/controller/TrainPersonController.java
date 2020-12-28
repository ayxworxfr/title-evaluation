package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Experience;
import com.evildoer.evaluation.model.entity.TrainPerson;
import com.evildoer.evaluation.service.ITrainPersonService;
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
@RequestMapping("/evaluation/{evaluation_id:\\d+}/train-person")
public class TrainPersonController {
    private final ITrainPersonService trainPersonService;

    public TrainPersonController(ITrainPersonService trainPersonService) {
        this.trainPersonService = trainPersonService;
    }

    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/list")
    public ServerResponse list(@PathVariable("evaluation_id") long evaluation_id){
        List<TrainPerson> trainPerson =trainPersonService.listEvaluation(evaluation_id);
        return  ServerResponse.createBySuccess(trainPerson);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody TrainPerson trainPerson,@PathVariable("evaluation_id") long evaluation_id) {
        trainPerson.setEvaluationId(evaluation_id);
        return this.trainPersonService.addExperience(trainPerson);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        TrainPerson trainPerson = trainPersonService.getById(id);
        if (null != trainPerson) {
            return ServerResponse.createBySuccess(trainPerson);
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
        Boolean result = trainPersonService.removeById(id);
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
                                     @RequestBody TrainPerson trainPerson) {
        trainPerson.setId(id.longValue());
        trainPerson.setUpdateTime(LocalDateTime.now());
        boolean result =trainPersonService.updateById(trainPerson);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }
}
