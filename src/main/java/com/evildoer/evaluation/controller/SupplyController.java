package com.evildoer.evaluation.controller;


import com.evildoer.evaluation.common.domain.ServerResponse;
import com.evildoer.evaluation.service.ISupplyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author evildoer
 * @since 2020-11-19
 */
@RestController
@RequestMapping("/supply")
public class SupplyController {

    private final ISupplyService supplyService;

    public SupplyController(ISupplyService supplyService) {
        this.supplyService = supplyService;
    }

    @PostMapping("/upload")
    public ServerResponse upload(@RequestParam("file") MultipartFile file) {
        return supplyService.upload(file);
    }
}
