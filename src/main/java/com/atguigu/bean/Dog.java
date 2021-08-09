package com.atguigu.bean;/*
 * @AUTHOR   LiXiang
 * @Classname Dog
 *
 * @Date 2021/8/6 ÏÂÎç3:02
 *

 * @userName
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    public Dog(){
        System.out.println(
                "dog constructor....."
        );
    }

    @PostConstruct
    public void  init(){
        System.out.println(" init ... after Constructor");

    }

    @PreDestroy
    public void destroy(){

        System.out.println("destroy... before deposit");
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }



}
