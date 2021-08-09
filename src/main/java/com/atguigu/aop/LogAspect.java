package com.atguigu.aop;/*
 * @AUTHOR   LiXiang
 * @Classname LogAspect
 *
 * @Date 2021/8/8 ����10:26
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
        System.out.println("�������У������ǣ�{}");
    }

    @After("pointcut()")
    public void logEnd(){
        System.out.println("���������������ǣ�{}");
    }

    @AfterReturning("com.atguigu.aop.LogAspect.pointcut()")
    public void logReturn(){
        System.out.println("������������");
    }

    @AfterThrowing(value = "pointcut()")
    public void logException(){
        System.out.println("�����쳣�������쳣��Ϣ��{}");
    }







}
