package com.evildoer.evaluation.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName UploadUtils
 * @Description 上传文件
 * @Author 安羽兮
 * @Date 2020/11/2010:49
 * @Version 1.0
 **/
public class UploadUtils {

    @Value("${spring.uploadPath}")
    private static String uploadPath;

    // 文件实际保存名称前缀
    private static String prefix = "";

    /**
     * @Author 安羽兮
     * @Description 以随机名称保存文件
     * @Date 11:03 2020/11/20
     * @Param [file, prefix]
     * @Return java.util.Map<java.lang.String, java.lang.String>
     **/
    public static Map<String, String> upload(MultipartFile file) {
        // 图片路径
        String imgUrl = null;
        //上传
        try {
            String filename = upload(file, uploadPath, file.getOriginalFilename());
            Map result = new HashMap<>();
            result.put("path", filename);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @Author 安羽兮
     * @Description 文件保存名称包含前缀prefix
     * @Date 11:03 2020/11/20
     * @Param [file, prefix]
     * @Return java.util.Map<java.lang.String, java.lang.String>
     **/
    public static Map<String, String> upload(MultipartFile file, String pre) {
        prefix = pre;
        // 图片路径
        return upload(file);
    }

    public static ResponseEntity show(String fileName, ResourceLoader resourceLoader) {
        try {
            // 由于是读取本机的文件，file是一定要加上的， path是在application配置文件中的路径
            return ResponseEntity.ok(resourceLoader.getResource("file:" + uploadPath + fileName));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    private static String upload(MultipartFile file, String path, String fileName) throws Exception {
        // 生成新的文件名
        String realPath = path + "/" + prefix + UUID.randomUUID().toString().replace("-", "") + fileName.substring(fileName.lastIndexOf("."));
        File dest = new File(realPath);
        // 判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        // 保存文件
        file.transferTo(dest);
        return dest.getName();
    }
}
