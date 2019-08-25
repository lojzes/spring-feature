package com.lojzes.framework.core.enableConfig;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2019/8/25 0025 21:56
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(SysEnableImportBeanDefinitionRegistrar.class)
public @interface EnableEnv {

    boolean china();
    boolean enlish() default false;
}
