package com.atguigu.bean;/*
 * @AUTHOR   LiXiang
 * @Classname Red
 *
 * @Date 2021/8/7 ����8:48
 *

 * @userName
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class Red implements ApplicationContextAware , BeanNameAware {


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {


        System.out.println("����� IOC"+applicationContext);
    }

    public void setBeanName(String s) {
        System.out.println("��ǰBean������"+s);
    }

}
