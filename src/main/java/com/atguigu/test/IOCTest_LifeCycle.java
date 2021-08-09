package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname IOCTest_LifeCycle
 *
 * @Date 2021/8/6 下午2:44
 *

 * @userName
 */

import com.atguigu.config.MainConfigOfLiftCircle;
import org.junit.jupiter.api.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //创建ioc容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfLiftCircle.class);
        System.out.println("容器创建完成。。。");
        System.out.println("容器开始销毁");
        annotationConfigApplicationContext.close();






    }


}
