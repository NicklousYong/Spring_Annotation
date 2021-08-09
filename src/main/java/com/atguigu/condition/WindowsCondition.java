package com.atguigu.condition;/*
 * @AUTHOR   LiXiang
 * @Classname WindowsCondition
 *
 * @Date 2021/8/6 ÉÏÎç10:27
 *

 * @userName
 */

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {


    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment=context.getEnvironment();
        String property =environment.getProperty("os.name");
        if (property.contains("Win")){
            return true;
        }
        return false;
    }
}
