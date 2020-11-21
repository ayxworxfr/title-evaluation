package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.model.entity.BranchOffice;
import com.evildoer.evaluation.model.vo.BranchOfficeVo;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface IBranchOfficeService extends IService<BranchOffice> {

    PageInfo<BranchOfficeVo> pageByQuery(BasePage query);
}
