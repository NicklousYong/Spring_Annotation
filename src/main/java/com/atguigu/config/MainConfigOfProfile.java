package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MainConfigOfProfile
 *
 * @Date 2021/8/7 ����8:56
 *

 * @userName
 */

import com.atguigu.bean.Yellow;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;




import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Profile ���Ը��ݻ������л�һϵ��������������������ԣ���������
 * ����Դ���������ݿ��л�
 *
 *
 * @Profile:ָ�����ĸ����������ĸ��������ָ�������κλ�������ʹ��������
 *  profile����д��Bean�ϣ�������д������
 *  û�б�ע������ʶ��bean���κλ����¶����Լ���
 */

@PropertySource("classpath:/dbconfig.properties")
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware {


    @Value("${db.user}")
    private String user;

    private String driverClass;

    private StringValueResolver valueResolver;

    @Bean
    @Profile("test")
    public Yellow yellow(){
        return new Yellow();
    }


    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceTest() throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword("1234");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClass(driverClass);

        return dataSource;

    }

    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSourceDev(@Value("${db.password}") String pwd) throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/dev");
        dataSource.setDriverClass(driverClass);

        return dataSource;

    }

    @Profile("prod")
    @Bean("prodDataSource")
    public DataSource dataSourceProd(@Value("${db.password}") String pwd) throws PropertyVetoException {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/prod");

        dataSource.setDriverClass(driverClass);
        return dataSource;

    }


    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.valueResolver = resolver;
        driverClass=valueResolver.resolveStringValue("db.driverClass");
    }
}
