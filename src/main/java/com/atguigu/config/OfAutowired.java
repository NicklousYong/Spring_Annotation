package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname OfAutowired
 *
 * @Date 2021/8/7 обнГ7:37
 *

 * @userName
 */

import com.atguigu.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({"com.atguigu.service","com.atguigu.controller","com.atguigu.dao","com.atguigu.bean"})
public class OfAutowired {




}
