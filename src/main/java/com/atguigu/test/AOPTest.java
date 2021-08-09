package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname AOPTest
 *
 * @Date 2021/8/8 ����4:28
 *

 * @userName
 */

/**
 * ԭ������������ע����ʲô�����������ʲôʱ����������������ʱ��Ĺ��ܡ�
 * @EnableAutoProxy
 * @EnavleAutoProxy��ʲô��
 *          @Import(AspectJAutoProxyRegister):�������е���AspectJAutoProxyRegister
 *              ����AspectJAutoProxyRegister�Զ����������ע��Bean
 *              internalAutoProxyCreater = AnnotationAwareAspectJAutoProxyCreator();
 *          ��������ע��һ��AnnotationAwareAspectJAutoProxyCreator
 *
 *          AnnotationAwareAspectJAutoProxyCreator�Ĺ��ܣ�
 *              annotationAwareAspectJAutoProxyCreator
 *                  -->AspectJAwareAdvisorAutoProxyCreator
 *                      -->AbstractAdvisorAutoProxyCreator
 *                          -->AbstractAutoProxyCreator
 *                              -->implements SmartInstaniatationAwareBeanPostProcessor,BeanFactoryAware
 *                              ��ע���ô���������bean��ʼ���ǰ�󣩡��Զ�װ��beanFactory
 *
 *
 *                              AbstractAutoProxyCreator.setBeanFactory():
 *                              AbstractAutoProxyCreater.���ô�����߼�
 *
 *                              AbstractAdvisorAutoProxyCreator.setBeanFactory()
 *                              AbstractAdvisorAutoProxyCreator.initBeanFactory()
 *
 *                              AnnotationAwareAspectJAutoProxyCreator.initBeanFactory();
 *
 *
 *
 *     ���̣�
 *          1.���������࣬����IOC����
 *          2.ע�������࣬����refresh()ˢ������;
 *          3.registerBeanPostProcessors(beanFactory);ע��bean�ĺ��ô�����������bean�Ĵ���
 *              1���Ȼ�ȡIOC�������Ѿ������˵���Ҫ�������������BeanPostProcessor
 *              2) �������м�����BeanPostProcessor
 *              3) ����ע��ʵ����PriorityOrdered�ӿڵ�BeanPostProcessor
 *              4) �ٸ�������ע��ʵ����Ordered�ӿڵ�BeanPostProcessor
 *              5) ע��ûʵ�ֽӿڵ�BeanPostProcessor
 *              6) ע��BeanPostProcessor,ʵ���Ͼ��Ǵ���BeanPostProcessorȻ�󱣴浽������
 *              7����δ���internalAutoProxyCreator
 *                      ����internalAutoProxyCreator��BeanPostProcessor  [AnnotationAwareAspectJAutoProxyCreator]
 *                      1.����bean��ʵ��
 *                      2.populationBean ��bean��ֵ
 *                      3.initilizationBean ��ʼ��bean
 *                              1.invokeAwareMethods():����aware�ӿڵķ����ص�
 *                              2.applyBeanPostProcessorBeforeInitialization();Ӧ�ú��ô�������BeforeInitialization();
 *                              3.invokeInitMethods():ִ���Զ���ĳ�ʼ������
 *                              4.applyBeanPostProcessorsAfterInitialization():ִ�к��ô�������postProcessAfterInitialization����
 *                      4.BeanPostProcessor(AnnotationAwareAspectJAutoProxyCreater) �����ɹ�   -->aspectJAdvisorsBuilder
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
