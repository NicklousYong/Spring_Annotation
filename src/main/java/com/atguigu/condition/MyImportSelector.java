package com.atguigu.condition;/*
 * @AUTHOR   LiXiang
 * @Classname MyImportSelector
 *
 * @Date 2021/8/6 下午12:42
 *

 * @userName
 */

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    //返回值就是要导入到容器中的类
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {


        return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
    }
}
