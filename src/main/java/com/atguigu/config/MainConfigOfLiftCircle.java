package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MainConfigOfLiftCircle
 *
 * @Date 2021/8/6 ����2:36
 *
 * @userName
 */


import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigOfLiftCircle {

    /**
     * bean���������ڣ�ָ��bean��������ʼ�������ٵĹ���
     *
     * 1.ָ����ʼ�������ٷ���
     *      initMethod      ��     destroyMethod
     *      ��ʵ����������������ʱ�򴴽�ʵ��
     *      ��ʵ������ȡ�õ�ʱ�򴴽�ʵ��
     * //�ر�������
     *      application.close();
     *
     * 2.ͨ����beanʵ��InitializingBean()    ��   DisposableBean()
     *
     * 3.����ʹ��JSR250�淶���ע��
     * @PostConstruct:��Bean������ɣ��������Ը�ֵ���
     * @PreDestory:��Bean���Ƴ�֮ǰ
     *
     *4.BeanPostProcessor
     *  postProcessorBeforeInitialization   ����֮ǰ����
     *  postProcessorAfterInitialization    ����֮�����
     *
     *
     */
    @Bean
    public Car car(){
        return new Car();

    }




}
