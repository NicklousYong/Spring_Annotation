package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MainConfigOfProfile
 *
 * @Date 2021/8/7 下午8:56
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
 * Profile 可以根据环境来切换一系列组件，包括开发，测试，生产环境
 * 数据源：过个数据库切换
 *
 *
 * @Profile:指定在哪个环境下用哪个组件，不指定，则任何环境都能使用这个组件
 *  profile除了写在Bean上，还可以写在类上
 *  没有标注环境标识的bean在任何环境下都可以加载
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
