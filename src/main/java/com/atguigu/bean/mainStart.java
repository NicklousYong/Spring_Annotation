package com.atguigu.bean;/*
 * @AUTHOR   LiXiang
 * @Classname main
 *
 * @Date 2021/8/5 обнГ3:20
 *

 * @userName
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainStart {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println("person's age is : "+person.getName());

    }

}
