package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname IOCTestPropertyValue
 *
 * @Date 2021/8/7 ÏÂÎç1:29
 *

 * @userName
 */

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfigOfLiftCircle;
import com.atguigu.config.MainConfigOfPropertyValues;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class IOCTestPropertyValue {


    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=
                new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
        Environment environment= annotationConfigApplicationContext.getEnvironment();
        System.out.println("====================================");
        System.out.println("Environment properties is : "+environment.toString());
        System.out.println("====================================");

        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(" our person is :  " +person.toString());
        for (String name : names) {
            System.out.println(name);
        }


    }


}
