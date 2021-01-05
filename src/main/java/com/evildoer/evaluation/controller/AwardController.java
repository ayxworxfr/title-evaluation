package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Award;
import com.evildoer.evaluation.service.IAwardService;
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
@RequestMapping("/evaluation/{evaluation_id:\\d+}/award")
public class AwardController {
    private final IAwardService awardService;

    public AwardController(IAwardService awardService) {
        this.awardService = awardService;
    }

    /**
     * @return
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @GetMapping("/list")
    public ServerResponse<List<Award>> list(@PathVariable("evaluation_id") long evaluation_id) {
        List<Award> experiences = awardService.listEvaluation(evaluation_id);
        return ServerResponse.createBySuccess(experiences);
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Award award, @PathVariable("evaluation_id") long evaluation_id) {
        award.setEvaluationId(evaluation_id);
        return this.awardService.addExperience(award);
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Award award = awardService.getById(id);
        if (null != award) {
            return ServerResponse.createBySuccess(award);
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
        Boolean result = awardService.removeById(id);
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
                                     @RequestBody Award award) {
        award.setId(id.longValue());
        award.setUpdateTime(LocalDateTime.now());
        boolean result = awardService.updateById(award);
        if (result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
