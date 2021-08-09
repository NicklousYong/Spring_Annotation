package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname IOC_TestOfAutowired
 *
 * @Date 2021/8/7 下午7:46
 *

 * @userName
 */

import com.atguigu.bean.Boss;
import com.atguigu.config.OfAutowired;
import com.atguigu.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class IOC_TestOfAutowired {

    /**
     * 1.默认按照类型进行赋值
     * 2、如果找到相同类型组件，再将属性名称作为类型查找
     * 3.使用Qualifier来进行指定属性
     * 4.@Autowired指定为false的情况下，没有bean不会报错
     * 5.@Primary可以指定首选bean
     * 6.@Autowired注在方法上，创建当前对象时会调用该方法
     *
     *
     * 关于Resource:
     *       1.按照组件名称进行装配，也可以使用名称进行装配@Resource(name="")
     *
     *
     * 关于inject：
     *      1.需要导入相关包
     *
     *
     * 关于Aware:自定义组件想要使用Spring组件（ApplicationContext,BeanFactory,...）的时候，
     * 可以使用xxxxxxAware接口来实现。
     *
     *
     */

    @Test
    public  void test01(){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(OfAutowired.class
        );
        Boss boss= annotationConfigApplicationContext.getBean(Boss.class);
        System.out.println(boss.toString());


    }

}
