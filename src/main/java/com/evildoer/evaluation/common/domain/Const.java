package com.evildoer.evaluation.common.domain;

/**
 * @ClassName Const
 * @Description TODO
 * @Author 安羽兮
 * @Date 2020/11/1920:06
 * @Version 1.0
 **/
public class Const {

    /**
     * @Author 安羽兮
     * @Description 用户角色
     * @Date 20:07 2020/11/19
     **/
    public enum Role {
        ADMIN(0, "admin"),      // 管理员
        UNIT(1, "unit"),        // 公司管理员
        BRANCH(2, "branch"),    // 分公司管理员
        USER(3, "user"),        // 分公司员工
        PERSON(4, "person"),    // 个人账户
        JURY(5, "jury");        // 评审员通过code登录

        private int code;
        private String role;

        Role(int code, String role) {
            this.code = code;
            this.role = role;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }
    }

    public static final String PASSWORD = "It's a secret!";


    /**
     * @Description Token
     * @Date 19:29 2019/12/3
     **/
    public static final String TOKEN = "Authentication";

    public static final String TOKEN_CACHE_PREFIX = "evaluation.cache.token";


    /**
     * 上传图片类型
     **/
    // 单位签章
    public static final String UNIT_SIGNATURE = "unit_signature";
    // 单位手持身份证照片
    public static final String UNIT_IMAGE = "unit_image";
    // 单位营业执照图片
    public static final String LINCENSE = "license";
}
