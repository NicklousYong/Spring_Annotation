package com.atguigu.bean;/*
 * @AUTHOR   LiXiang
 * @Classname MyBeanPostProcessor
 *
 * @Date 2021/8/6 ÏÂÎç3:07
 *

 * @userName
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+s+" => "+ o);
        return o;
    }



    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization"+s+" => "+ o);
        return o;
    }




}
