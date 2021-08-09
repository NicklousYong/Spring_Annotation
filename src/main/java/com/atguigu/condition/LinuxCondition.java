package com.atguigu.condition;/*
 * @AUTHOR   LiXiang
 * @Classname LinuxCondition
 *
 * @Date 2021/8/6 ����10:26
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
            //�ж�������ʹ�õ�������
            ConditionContext context,
            //ע����Ϣ
            AnnotatedTypeMetadata metadata) {
        //��ȡIOC�Ĵ�������
        ConfigurableBeanFactory beanFactory = context.getBeanFactory();
        //��ȡ�������
        ClassLoader classLoader=context.getClassLoader();
        //3.��ȡ��ǰ������Ϣ
        Environment environment =  context.getEnvironment();
        BeanDefinitionRegistry beanDefinitionRegistry= context.getRegistry();
        String property = environment.getProperty("os.name");
        if (property.contains("linux")){
            return true;
        }
        return false;
    }
}
