package com.shallowan.seckill.access;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author ShallowAn
 */
@Target({METHOD})
@Retention(RUNTIME)
public @interface AccessLimit {
    int seconds();

    int maxCount();

    boolean needLogin() default true;
}
