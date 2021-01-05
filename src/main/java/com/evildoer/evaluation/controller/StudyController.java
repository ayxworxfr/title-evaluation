package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Study;
import com.evildoer.evaluation.service.IStudyService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
@RestController
@RequestMapping("/evaluation/{evaluation_id:\\d+}/study")
public class StudyController {

    private final IStudyService studyService;

    public StudyController(IStudyService studyService) {
        this.studyService = studyService;
    }

    /**
     * @return
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @GetMapping("/list")
    public ServerResponse<List<Study>> list(@PathVariable("evaluation_id") long evaluation_id) {
        List<Study> studies = studyService.listEvaluation(evaluation_id);
        return ServerResponse.createBySuccess(studies);
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Study study, @PathVariable("evaluation_id") long evaluation_id) {
        study.setEvaluationId(evaluation_id);
        return this.studyService.addStudy(study);
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Study study = studyService.getById(id);
        if (null != study) {
            return ServerResponse.createBySuccess(study);
        } else {
            return ServerResponse.createByError();
        }
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @DeleteMapping("/delete/{id:\\d+}")
    public ServerResponse delete(@PathVariable("id") Long id) {
        Boolean result = studyService.removeById(id);
        if (result) {
            return ServerResponse.createBySuccess("删除成功");
        } else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @PutMapping("/{id:\\d+}")
    public ServerResponse updateById(@PathVariable("id") Integer id,
                                     @RequestBody Study study) {
        study.setId(id.longValue());
        study.setUpdateTime(LocalDateTime.now());
        boolean result = studyService.updateById(study);
        if (result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
