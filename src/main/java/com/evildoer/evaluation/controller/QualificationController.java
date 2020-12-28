package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Qualification;
import com.evildoer.evaluation.service.IQualificationService;
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
@RequestMapping("/evaluation/{evaluation_id:\\d+}/qualification")
public class QualificationController {
    private final IQualificationService qualificationService;

    public QualificationController(IQualificationService qualificationService) {
        this.qualificationService = qualificationService;
    }

    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/list")
    public ServerResponse list(@PathVariable("evaluation_id") long evaluation_id){
        List<Qualification> experiences = qualificationService.listEvaluation(evaluation_id);
        return  ServerResponse.createBySuccess(experiences);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Qualification qualification,@PathVariable("evaluation_id") long evaluation_id) {
        qualification.setEvaluationId(evaluation_id);
        return this.qualificationService.addExperience(qualification);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Qualification qualification = qualificationService.getById(id);
        if (null != qualification) {
            return ServerResponse.createBySuccess(qualification);
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
        Boolean result = qualificationService.removeById(id);
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
                                     @RequestBody Qualification qualification) {
        qualification.setId(id.longValue());
        qualification.setUpdateTime(LocalDateTime.now());
        boolean result =qualificationService.updateById(qualification);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
