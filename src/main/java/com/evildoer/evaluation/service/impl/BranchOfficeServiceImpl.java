package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.common.domain.BasePage;
import com.evildoer.evaluation.dao.BranchOfficeMapper;
import com.evildoer.evaluation.model.entity.BranchOffice;
import com.evildoer.evaluation.model.vo.BranchOfficeVo;
import com.evildoer.evaluation.service.IBranchOfficeService;
import com.evildoer.evaluation.service.IUnitService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@Service
public class BranchOfficeServiceImpl extends ServiceImpl<BranchOfficeMapper, BranchOffice> implements IBranchOfficeService {

    private final IUnitService unitService;

    public BranchOfficeServiceImpl(IUnitService unitService) {
        this.unitService = unitService;
    }

    @Override
    public PageInfo pageByQuery(BasePage query) {
        PageHelper.startPage(query.getPage(), query.getPageSize());
        List<BranchOffice> list = this.list();
        PageInfo<?> data = new PageInfo<>(list);
        ArrayList<BranchOfficeVo> result = new ArrayList<>();
        for (Object office : data.getList()) {
            BranchOfficeVo vo = new BranchOfficeVo();
            BeanUtils.copyProperties(office, vo);
            vo.setUnit(unitService.getById(((BranchOffice) office).getUnitId()));
            result.add(vo);
        }

        Class<?> c = data.getClass();
        try {
            //获取类对象中的方法                 类中方法名  方法的参数类型
            Method m = c.getDeclaredMethod("setList", List.class);
            m.invoke(data, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        data.setList(result);
        return data;
    }
}
