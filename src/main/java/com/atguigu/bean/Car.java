package com.atguigu.bean;/*
 * @AUTHOR   LiXiang
 * @Classname Car
 *
 * @Date 2021/8/6 обнГ2:40
 *

 * @userName
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car  {

    @Autowired
    public Car(){
        System.out.println("car constructor........");
    }

    public void init(){
        System.out.println("car...init...");
    }

    public void destroy(){
        System.out.println("car...destroy");
    }





}
