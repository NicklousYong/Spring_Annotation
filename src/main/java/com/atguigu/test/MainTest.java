package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname MainTest
 *
 * @Date 2021/8/5 ÏÂÎç4:01
 *

 * @userName
 */

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {



    @SuppressWarnings("resources")
    @Test
    public void test01(){
            AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
            String[] names =annotationConfigApplicationContext.getBeanDefinitionNames();
            for (String name : names) {
                System.out.println(name);
            }
    }


    @SuppressWarnings("resources")
    @Test
    public void test02(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names =annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Person person = (Person)annotationConfigApplicationContext.getBean("person");


    }




}
