package com.atguigu.aop;/*
 * @AUTHOR   LiXiang
 * @Classname LogAspect
 *
 * @Date 2021/8/8 上午10:26
 *

 * @userName
 */

import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspect {

    @Pointcut("execution(public int com.atguigu.aop.MathCalculator.*(.. ))")
    public void pointcut(){

    }

    @Before("execution(public int com.atguigu.aop.MathCalculator.div(int,int))")
    public void logStart(){
        System.out.println("除法运行，参数是：{}");
    }

    @After("pointcut()")
    public void logEnd(){
        System.out.println("除法结束，参数是：{}");
    }

    @AfterReturning("com.atguigu.aop.LogAspect.pointcut()")
    public void logReturn(){
        System.out.println("除法正常返回");
    }

    @AfterThrowing(value = "pointcut()")
    public void logException(){
        System.out.println("除法异常。。。异常信息：{}");
    }







}
