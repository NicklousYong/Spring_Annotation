package com.atguigu.bean;/*
 * @AUTHOR   LiXiang
 * @Classname ColorFaactoryBean
 *
 * @Date 2021/8/6 обнГ2:30
 *

 * @userName
 */

import org.springframework.beans.factory.FactoryBean;


public class ColorFaactoryBean implements FactoryBean<Color> {

    public Color getObject() throws Exception {
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
