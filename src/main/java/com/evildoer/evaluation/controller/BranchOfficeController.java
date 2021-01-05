package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.BranchOffice;
import com.evildoer.evaluation.model.vo.BranchOfficeVo;
import com.evildoer.evaluation.service.IBranchOfficeService;
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
@RequestMapping("/branch-office")
public class BranchOfficeController {

    private final IUnitService unitService;

    private final IBranchOfficeService officeService;

    public BranchOfficeController(IUnitService unitService, IBranchOfficeService officeService) {
        this.unitService = unitService;
        this.officeService = officeService;
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
    public ServerResponse<PageInfo<BranchOfficeVo>> list() {
        BasePage query = new BasePage();
        return ServerResponse.createBySuccess(officeService.pageByQuery(query));
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
        BranchOfficeVo branchOfficeVo = new BranchOfficeVo();
        BranchOffice branchOffice = officeService.getById(id);
        if (null != branchOffice) {
            branchOfficeVo.setUnit(unitService.getById(branchOffice.getUnitId()));
            return ServerResponse.createBySuccess(branchOfficeVo);
        } else {
            return ServerResponse.createByError();
        }
    }

    /**
     * @Author 安羽兮
     * @Description 添加分公司
     * @Date 19:56 2020/11/21
     * @Param [branchOffice]
     * @Return com.evildoer.evaluation.common.domain.ServerResponse
     **/
    @PostMapping("/add")
    public ServerResponse add(@NotNull @RequestBody BranchOffice branchOffice) {
        Boolean result = officeService.saveOrUpdate(branchOffice);
        if (!result) {
            return ServerResponse.createByErrorMessage("添加失败");
        }
        return ServerResponse.createBySuccess("添加成功");
    }

    @DeleteMapping("/delete/{branchOffice_id:\\d+}")
    public ServerResponse delete(@PathVariable("branchOffice_id") Long branchOfficeId) {
        Boolean result = officeService.removeById(branchOfficeId);
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
     * @Param [branchOffice]
     * @Return com.explore.common.ServerResponse
     **/
    @PutMapping("/update")
    public ServerResponse update(@NotNull @RequestBody BranchOffice branchOffice) {
        Boolean result = officeService.saveOrUpdate(branchOffice);
        if (result) {
            return ServerResponse.createBySuccess("更新成功");
        } else {
            return ServerResponse.createByErrorMessage("更新失败");
        }
    }
}
