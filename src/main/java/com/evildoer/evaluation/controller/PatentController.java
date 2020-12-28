package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Patent;
import com.evildoer.evaluation.service.IPatentService;
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
@RequestMapping("/evaluation/{evaluation_id:\\d+}//patent")
public class PatentController {
    private final IPatentService patentService;

    public PatentController(IPatentService patentService) {
        this.patentService = patentService;
    }

    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/list")
    public ServerResponse list(@PathVariable("evaluation_id") long evaluation_id){
        List<Patent> patents = patentService.listEvaluation(evaluation_id);
        return  ServerResponse.createBySuccess(patents);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Patent patent,@PathVariable("evaluation_id") long evaluation_id) {
        patent.setEvaluationId(evaluation_id);
        return this.patentService.addExperience(patent);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Patent patent = patentService.getById(id);
        if (null != patent) {
            return ServerResponse.createBySuccess(patent);
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
        Boolean result = patentService.removeById(id);
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
                                     @RequestBody Patent patent) {
        patent.setId(id.longValue());
        patent.setUpdateTime(LocalDateTime.now());
        boolean result =patentService.updateById(patent);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
