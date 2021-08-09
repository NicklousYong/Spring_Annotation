package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MainConfigOfLiftCircle
 *
 * @Date 2021/8/6 下午2:36
 *
 * @userName
 */


import com.atguigu.bean.Car;
import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@PropertySource("classpath:/person.properties")
@Configuration
public class MainConfigOfPropertyValues {

    /**
     * bean的生命周期：指定bean创建，初始化和销毁的过程
     *
     * 1.指定初始化和销毁方法
     *      initMethod      和     destroyMethod
     *      单实例：在容器创建的时候创建实例
     *      多实例：在取用的时候创建实例
     * //关闭容器：
     *      application.close();
     *
     * 2.通过让bean实现InitializingBean()    和   DisposableBean()
     *
     * 3.可以使用JSR250规范里的注解
     * @PostConstruct:在Bean创建完成，并且属性赋值完成
     * @PreDestory:在Bean被移除之前
     *
     *4.BeanPostProcessor
     *  postProcessorBeforeInitialization   创建之前调用
     *  postProcessorAfterInitialization    创建之后调用
     *
     *
     */
    @Bean
    public Car car(){
        return new Car();

    }

    @Bean("person")
    public Person Person(){
        return new Person();
    }



}
