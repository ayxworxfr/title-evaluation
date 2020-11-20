package com.evildoer.evaluation.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.model.entity.Supply;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
public interface ISupplyService extends IService<Supply> {

    ServerResponse upload(MultipartFile file);

    ResponseEntity show(String fileName);
}
