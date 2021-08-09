package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname AOPTest
 *
 * @Date 2021/8/8 下午4:28
 *

 * @userName
 */

/**
 * 原理：看给容器中注册了什么组件，这个组件什么时候工作。这个组件工作时候的功能。
 * @EnableAutoProxy
 * @EnavleAutoProxy是什么？
 *          @Import(AspectJAutoProxyRegister):给容器中导入AspectJAutoProxyRegister
 *              利用AspectJAutoProxyRegister自定义给容器中注册Bean
 *              internalAutoProxyCreater = AnnotationAwareAspectJAutoProxyCreator();
 *          给容器中注册一个AnnotationAwareAspectJAutoProxyCreator
 *
 *          AnnotationAwareAspectJAutoProxyCreator的功能？
 *              annotationAwareAspectJAutoProxyCreator
 *                  -->AspectJAwareAdvisorAutoProxyCreator
 *                      -->AbstractAdvisorAutoProxyCreator
 *                          -->AbstractAutoProxyCreator
 *                              -->implements SmartInstaniatationAwareBeanPostProcessor,BeanFactoryAware
 *                              关注后置处理器（在bean初始完成前后）、自动装配beanFactory
 *
 *
 *                              AbstractAutoProxyCreator.setBeanFactory():
 *                              AbstractAutoProxyCreater.后置处理的逻辑
 *
 *                              AbstractAdvisorAutoProxyCreator.setBeanFactory()
 *                              AbstractAdvisorAutoProxyCreator.initBeanFactory()
 *
 *                              AnnotationAwareAspectJAutoProxyCreator.initBeanFactory();
 *
 *
 *
 *     流程：
 *          1.传入配置类，创建IOC容器
 *          2.注册配置类，调用refresh()刷新容器;
 *          3.registerBeanPostProcessors(beanFactory);注册bean的后置处理器来拦截bean的创建
 *              1）先获取IOC容器中已经定义了的需要创建对象的所有BeanPostProcessor
 *              2) 给容器中加入别的BeanPostProcessor
 *              3) 优先注册实现了PriorityOrdered接口的BeanPostProcessor
 *              4) 再给容器中注册实现了Ordered接口的BeanPostProcessor
 *              5) 注册没实现接口的BeanPostProcessor
 *              6) 注册BeanPostProcessor,实际上就是创建BeanPostProcessor然后保存到容器中
 *              7）如何创建internalAutoProxyCreator
 *                      创建internalAutoProxyCreator的BeanPostProcessor  [AnnotationAwareAspectJAutoProxyCreator]
 *                      1.创建bean的实例
 *                      2.populationBean 给bean赋值
 *                      3.initilizationBean 初始化bean
 *                              1.invokeAwareMethods():处理aware接口的方法回调
 *                              2.applyBeanPostProcessorBeforeInitialization();应用后置处理器的BeforeInitialization();
 *                              3.invokeInitMethods():执行自定义的初始化方法
 *                              4.applyBeanPostProcessorsAfterInitialization():执行后置处理器的postProcessAfterInitialization方法
 *                      4.BeanPostProcessor(AnnotationAwareAspectJAutoProxyCreater) 创建成功   -->aspectJAdvisorsBuilder
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator mathCalculator=(MathCalculator)annotationConfigApplicationContext.getBean(MathCalculator.class);
        mathCalculator.div(6,2);




    }



}
