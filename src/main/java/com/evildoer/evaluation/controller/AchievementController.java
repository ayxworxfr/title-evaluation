package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Achievement;
import com.evildoer.evaluation.service.IAchievementService;
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
@RequestMapping("/evaluation/{evaluation_id:\\d+}/achievement")
public class AchievementController {

    private final IAchievementService achievementService;

    public AchievementController(IAchievementService achievementService) {
        this.achievementService = achievementService;
    }

    /**
     * @return
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @GetMapping("/list")
    public ServerResponse<List<Achievement>> list(@PathVariable("evaluation_id") long evaluation_id) {
        List<Achievement> achievements = achievementService.listEvaluation(evaluation_id);
        return ServerResponse.createBySuccess(achievements);
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @PostMapping("/add")
    public ServerResponse add(@RequestBody Achievement achievement, @PathVariable("evaluation_id") long evaluation_id) {
        achievement.setEvaluationId(evaluation_id);
        return this.achievementService.addExperience(achievement);
    }


    /**
     * @author pu
     * @data 2020/11/23
     * description:
     */
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Achievement achievement = achievementService.getById(id);
        if (null != achievement) {
            return ServerResponse.createBySuccess(achievement);
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
        Boolean result = achievementService.removeById(id);
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
                                     @RequestBody Achievement achievement) {
        achievement.setId(id.longValue());
        achievement.setUpdateTime(LocalDateTime.now());
        boolean result = achievementService.updateById(achievement);
        if (result)
            return ServerResponse.createBySuccessMessage("修改成功");
        return ServerResponse.createByErrorMessage("修改失败");
    }

}
