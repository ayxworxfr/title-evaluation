package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Unit;
import com.evildoer.evaluation.model.form.UnitQuery;
import com.evildoer.evaluation.service.IUnitService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/unit")
public class UnitController {
    private final IUnitService unitService;

    public UnitController(IUnitService unitService) {
        this.unitService = unitService;
    }

    /**
     * @return
     * @Author 安羽兮
     * @Description 返回列表
     * @Date 9:58 2020/11/22
     * @Param [page, limit]
     * @Return com.explore.common.ServerResponse
     */
    @GetMapping("/list")
    public ServerResponse<PageInfo<Unit>> list(UnitQuery query) {
        return ServerResponse.createBySuccess(unitService.pageByQuery(query));
    }

    /**
     * @Author 安羽兮
     * @Description 通过id查找
     * @Date 13:42 2020/7/16
     * @Param [id]
     * @Return com.explore.common.ServerResponse
     **/
    @GetMapping("/{id:\\d+}")
    public ServerResponse getById(@PathVariable("id") Long id) {
        Unit unit = unitService.getById(id);
        if (null != unit) {
            return ServerResponse.createBySuccess(unit);
        } else {
            return ServerResponse.createByError();
        }
    }

    @DeleteMapping("/delete/{unit_id:\\d+}")
    public ServerResponse delete(@PathVariable("unit_id") Long unitId) {
        Boolean result = unitService.removeById(unitId);
        if (result) {
            return ServerResponse.createBySuccess("删除成功");
        } else {
            return ServerResponse.createByErrorMessage("删除失败");
        }
    }

    /**
     * @Author 安羽兮
     * @Description //TODO
     * @Date 10:05 2020/11/22
     * @Param [unit]
     * @Return com.explore.common.ServerResponse
     **/
    @PutMapping("/update")
    public ServerResponse update(@NotNull @RequestBody Unit unit) {
        Boolean result = unitService.saveOrUpdate(unit);
        if (result) {
            return ServerResponse.createBySuccess("更新成功");
        } else {
            return ServerResponse.createByErrorMessage("更新失败");
        }
    }
}

