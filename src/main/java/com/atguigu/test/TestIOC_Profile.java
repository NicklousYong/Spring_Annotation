package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname TestIOC_Profile
 *
 * @Date 2021/8/8 上午10:00
 *

 * @userName
 */



import com.atguigu.config.MainConfigOfProfile;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class TestIOC_Profile {

    //1.使用命令行参数
    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);
        String[] names= annotationConfigApplicationContext.getBeanNamesForType(DataSource.class);
        annotationConfigApplicationContext.getEnvironment().setActiveProfiles("test");
        annotationConfigApplicationContext.register(MainConfigOfProfile.class);
        annotationConfigApplicationContext.refresh();



        for (String name : names) {
            System.out.println(name);
        }


    }


}
