package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Paper;
import com.evildoer.evaluation.service.IPaperService;
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
@RequestMapping("/evaluation/{evaluation_id:\\d+}/paper")
public class PaperController {
    private final IPaperService paperService;

    public PaperController(IPaperService paperService) {
        this.paperService = paperService;
    }

    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/list")
    public ServerResponse list(@PathVariable("evaluation_id") long evaluation_id){
        List<Paper> papers = paperService.listEvaluation(evaluation_id);
        return  ServerResponse.createBySuccess(papers);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Paper paper,@PathVariable("evaluation_id") long evaluation_id) {
        paper.setEvaluationId(evaluation_id);
        return this.paperService.addExperience(paper);
    }


    /**
     *@author pu
     *@data 2020/11/23
     *description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Paper paper = paperService.getById(id);
        if (null != paper) {
            return ServerResponse.createBySuccess(paper);
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
        Boolean result = paperService.removeById(id);
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
                                     @RequestBody Paper paper) {
        paper.setId(id.longValue());
        paper.setUpdateTime(LocalDateTime.now());
        boolean result =paperService.updateById(paper);
        if(result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
