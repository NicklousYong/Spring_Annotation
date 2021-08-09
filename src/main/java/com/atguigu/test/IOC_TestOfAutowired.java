package com.atguigu.test;/*
 * @AUTHOR   LiXiang
 * @Classname IOC_TestOfAutowired
 *
 * @Date 2021/8/7 ����7:46
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
     * 1.Ĭ�ϰ������ͽ��и�ֵ
     * 2������ҵ���ͬ����������ٽ�����������Ϊ���Ͳ���
     * 3.ʹ��Qualifier������ָ������
     * 4.@Autowiredָ��Ϊfalse������£�û��bean���ᱨ��
     * 5.@Primary����ָ����ѡbean
     * 6.@Autowiredע�ڷ����ϣ�������ǰ����ʱ����ø÷���
     *
     *
     * ����Resource:
     *       1.����������ƽ���װ�䣬Ҳ����ʹ�����ƽ���װ��@Resource(name="")
     *
     *
     * ����inject��
     *      1.��Ҫ������ذ�
     *
     *
     * ����Aware:�Զ��������Ҫʹ��Spring�����ApplicationContext,BeanFactory,...����ʱ��
     * ����ʹ��xxxxxxAware�ӿ���ʵ�֡�
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
