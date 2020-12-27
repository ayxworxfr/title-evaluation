package com.evildoer.evaluation.service.impl;

import com.evildoer.evaluation.dao.PatentMapper;
import com.evildoer.evaluation.model.entity.Patent;
import com.evildoer.evaluation.service.IPatentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author evildoer
 * @since 2020-12-27
 */
@Service
public class PatentServiceImpl extends ServiceImpl<PatentMapper, Patent> implements IPatentService {

}
