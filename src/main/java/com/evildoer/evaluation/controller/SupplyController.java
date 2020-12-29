package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Supply;
import com.evildoer.evaluation.model.vo.SupplyVo;
import com.evildoer.evaluation.service.IEvaluationService;
import com.evildoer.evaluation.service.ISupplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/evaluation/{evaluation_id:\\d+}/supply")
public class SupplyController {

    private final ISupplyService supplyService;
    private final IEvaluationService evaluationService;

    public SupplyController(ISupplyService supplyService, IEvaluationService evaluationService) {
        this.supplyService = supplyService;
        this.evaluationService = evaluationService;
    }



    @PostMapping("/upload")
    public ServerResponse upload(@RequestParam("file") MultipartFile file) {
        return supplyService.upload(file);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/list")
    public ServerResponse list(@PathVariable("evaluation_id") long evaluation_id){
        SupplyVo supplyVos = new SupplyVo();
        supplyVos.setEvaluation(evaluationService.getById(evaluation_id));
        BeanUtils.copyProperties(supplyVos,supplyService.getById(supplyVos.getEvaluation().getSupplyId()));
        return  ServerResponse.createBySuccess(supplyVos);
    }




    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Supply supply = supplyService.getById(id);
        if (null != supply) {
            return ServerResponse.createBySuccess(supply);
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
        Boolean result = supplyService.removeById(id);
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
                                     @RequestBody Supply supply) {
        supply.setId(id.longValue());
        supply.setUpdateTime(LocalDateTime.now());
        boolean result =supplyService.updateById(supply);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }
}
