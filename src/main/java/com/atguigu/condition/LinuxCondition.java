package com.atguigu.condition;/*
 * @AUTHOR   LiXiang
 * @Classname LinuxCondition
 *
 * @Date 2021/8/6 上午10:26
 *

 * @userName
 */


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxCondition implements Condition {

    public boolean matches(
            //判断条件能使用的上下文
            ConditionContext context,
            //注释信息
            AnnotatedTypeMetadata metadata) {
        //获取IOC的创建工厂
        ConfigurableBeanFactory beanFactory = context.getBeanFactory();
        //获取类加载器
        ClassLoader classLoader=context.getClassLoader();
        //3.获取当前环境信息
        Environment environment =  context.getEnvironment();
        BeanDefinitionRegistry beanDefinitionRegistry= context.getRegistry();
        String property = environment.getProperty("os.name");
        if (property.contains("linux")){
            return true;
        }
        return false;
    }
}
