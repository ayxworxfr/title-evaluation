package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Evaluation;
import com.evildoer.evaluation.model.form.EvaluationQuery;
import com.evildoer.evaluation.service.IEvaluationService;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/evaluation")
public class EvaluationController {

    private final IEvaluationService evaluationService;

    public EvaluationController(IEvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/list")
    public ServerResponse list(Integer userId){
        EvaluationQuery query = new EvaluationQuery();
        query.setUserId(userId);
        return ServerResponse.createBySuccess(evaluationService.pageByQuery(query));
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Evaluation evaluation) {
        return this.evaluationService.addEvaluation(evaluation);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Evaluation evaluation = evaluationService.getById(id);
        if (null != evaluation) {
            return ServerResponse.createBySuccess(evaluation);
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
        Boolean result = evaluationService.removeById(id);
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
                                     @RequestBody Evaluation evaluation) {
        evaluation.setId(id.longValue());
        evaluation.setUpdateTime(LocalDateTime.now());
        boolean result = evaluationService.updateById(evaluation);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
