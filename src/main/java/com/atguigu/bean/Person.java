package com.atguigu.bean;/*
 * @AUTHOR   LiXiang
 * @Classname Person
 *
 * @Date 2021/8/5 下午3:18
 *

 * @userName
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    //@Value赋值
    /**
     * 1.基本参数
     * 2.SPEl
     * 3.${}取出配置文件的值
     */
    @Value("张三")
    public String name;
    @Value("#{20-2}")
    public Integer age;

    public Person(String name, Integer age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }

    @Value("${person.nickName}")
    public String nickName;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
