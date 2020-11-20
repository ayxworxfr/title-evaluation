package com.evildoer.evaluation.controller;


import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 安羽兮
 * @Date 11:38 2019/10/7
 **/
@RestController
public class CaptchaController {

    public static final String KEY_CAPTCHA = "KEY_CAPTCHA";

    @RequestMapping("/Captcha.jpg")
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        // 不缓存此内容
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        HttpSession session = request.getSession();
        //定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(130, 53);
        String code = lineCaptcha.getCode();
        session.removeAttribute(KEY_CAPTCHA);
        session.setAttribute(KEY_CAPTCHA, code);
        // 将内存中的图片通过流动形式输出到客户端
        ImageIO.write(lineCaptcha.getImage(), "JPEG", response.getOutputStream());
    }

}