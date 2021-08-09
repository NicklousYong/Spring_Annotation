package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MyTypeFilter
 *
 * @Date 2021/8/5 下午4:32
 *

 * @userName
 */

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import java.io.IOException;
public class MyTypeFilter implements TypeFilter {


        public boolean match(
            MetadataReader metadataReader,
            MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类的注解信息
        AnnotatedTypeMetadata annotatedTypeMetadata =metadataReader.getAnnotationMetadata();
        //获取当前类的类信息
        ClassMetadata classMetadata =metadataReader.getClassMetadata();
        //获取当前类的资源信息(类的路径)
        Resource resource =metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("----> " + classMetadata.getClassName());
        if (className.contains("er")){
            return true;
        }
        return false;
    }
}
