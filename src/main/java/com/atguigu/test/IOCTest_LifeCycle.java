package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname IOCTest_LifeCycle
 *
 * @Date 2021/8/6 ����2:44
 *

 * @userName
 */

import com.atguigu.config.MainConfigOfLiftCircle;
import org.junit.jupiter.api.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_LifeCycle {

    @Test
    public void test01(){
        //����ioc����
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfLiftCircle.class);
        System.out.println("����������ɡ�����");
        System.out.println("������ʼ����");
        annotationConfigApplicationContext.close();






    }


}
