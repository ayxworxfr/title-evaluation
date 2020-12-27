package com.evildoer.evaluation.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.dao.SupplyMapper;
import com.evildoer.evaluation.model.entity.Supply;
import com.evildoer.evaluation.service.ISupplyService;
import com.evildoer.evaluation.utils.UploadUtils;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@Service
public class SupplyServiceImpl extends ServiceImpl<SupplyMapper, Supply> implements ISupplyService {

    private final ResourceLoader resourceLoader;

    public SupplyServiceImpl(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public ServerResponse upload(MultipartFile file) {
        Map<String, String> result = UploadUtils.upload(file);
        if (null != result)
            return ServerResponse.createBySuccess(result);
        return ServerResponse.createByErrorMessage("上传失败");

    }

    @Override
    public ResponseEntity show(String fileName) {
        return UploadUtils.show(fileName, resourceLoader);
    }

}
