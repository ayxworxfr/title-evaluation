package com.evildoer.evaluation.controller;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.dao.AwardMapper;
import com.evildoer.evaluation.model.entity.Award;
import com.evildoer.evaluation.service.IAwardService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
@RestController
@RequestMapping("/award")
public class AwardController {

    /**
     * <p>
     * 服务实现类
     * </p>
     *
     * @author evildoer
     * @since 2020-11-19
     */
    @Service
    public static class AwardServiceImpl extends ServiceImpl<AwardMapper, Award> implements IAwardService {


    }
}
