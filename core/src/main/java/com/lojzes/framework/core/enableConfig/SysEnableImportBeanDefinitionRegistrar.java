package com.lojzes.framework.core.enableConfig;

import org.springframework.aop.config.AopConfigUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * 描述：TODO
 *
 * @author lyyitit@foxmail.com
 * @date 2019/8/25 0025 22:16
 */
public class SysEnableImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

      //  AopConfigUtils.registerAspectJAnnotationAutoProxyCreatorIfNecessary(registry);


        Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();

        importingClassMetadata.


        for (String type: annotationTypes) {


            //AnnotationConfigUtils.registerAnnotationConfigProcessors()

        }



        System.out.println("importingClassMetadata = " + importingClassMetadata);
        System.out.println("registry = " + registry);



    }
}
