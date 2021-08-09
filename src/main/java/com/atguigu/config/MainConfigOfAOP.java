package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MainConfigOfAOP
 *
 * @Date 2021/8/8 обнГ4:09
 *

 * @userName
 */

import com.atguigu.aop.LogAspect;
import com.atguigu.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableAspectJAutoProxy
public class MainConfigOfAOP {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }






}
