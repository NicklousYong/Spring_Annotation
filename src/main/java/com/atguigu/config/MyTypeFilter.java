package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MyTypeFilter
 *
 * @Date 2021/8/5 ����4:32
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
        //��ȡ��ǰ���ע����Ϣ
        AnnotatedTypeMetadata annotatedTypeMetadata =metadataReader.getAnnotationMetadata();
        //��ȡ��ǰ�������Ϣ
        ClassMetadata classMetadata =metadataReader.getClassMetadata();
        //��ȡ��ǰ�����Դ��Ϣ(���·��)
        Resource resource =metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("----> " + classMetadata.getClassName());
        if (className.contains("er")){
            return true;
        }
        return false;
    }
}
