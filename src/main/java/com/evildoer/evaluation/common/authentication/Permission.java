package com.evildoer.evaluation.common.authentication;


import com.evildoer.evaluation.common.domain.Const.Role;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Permission {
    Role[] roles() default {Role.ADMIN, Role.USER};
}
