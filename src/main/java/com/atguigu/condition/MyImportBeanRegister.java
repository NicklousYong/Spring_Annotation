package com.atguigu.condition;/*
 * @AUTHOR   LiXiang
 * @Classname MyImportBeanRegister
 *
 * @Date 2021/8/6 ÏÂÎç12:49
 *

 * @userName
 */

import com.atguigu.bean.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanRegister implements ImportBeanDefinitionRegistrar {


    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean con = registry.containsBeanDefinition("com.atguigu.bean.Yellow");
        boolean con1 = registry.containsBeanDefinition("com.atguigu.bean.Blue");
        if (con && con1){
            RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Rainbow.class);
            registry.registerBeanDefinition("rainbow",rootBeanDefinition);
        }
    }
}
