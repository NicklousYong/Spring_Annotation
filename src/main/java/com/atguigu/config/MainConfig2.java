package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MainConfig2
 *
 * @Date 2021/8/6 ÉÏÎç9:50
 *

 * @userName
 */

import com.atguigu.bean.Color;
import com.atguigu.bean.ColorFaactoryBean;
import com.atguigu.bean.Person;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.MyImportBeanRegister;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.condition.WindowsCondition;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.*;
import org.springframework.core.env.ConfigurableEnvironment;
import java.util.Map;


@Configuration
@Import({Color.class, MyImportSelector.class, MyImportBeanRegister.class})
public class MainConfig2{


    public ColorFaactoryBean getColorFactoryBean(){
            return new ColorFaactoryBean();
    }

    @Test
    public void test03(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] names =annotationConfigApplicationContext.getBeanDefinitionNames();
        ConfigurableEnvironment environment= annotationConfigApplicationContext.getEnvironment();
        String property =environment.getProperty("os.name");
        System.out.println("Environment Name is £º "+property);
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("=================");
        Map<String,Person> persons =annotationConfigApplicationContext.getBeansOfType(Person.class);
        System.out.println(persons);

    }

    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person getPerson(){
        return new Person("Bill Gates",62);
    }

    @Bean("linus")
    @Conditional(LinuxCondition.class)
    public Person person02(){
        return new Person("Mac OS",48);
    }


}
