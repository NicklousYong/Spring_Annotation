package com.atguigu.config;/*
 * @AUTHOR   LiXiang
 * @Classname MainConfig
 *
 * @Date 2021/8/5 обнГ3:25
 *
 * @userName
 */
import com.atguigu.bean.Color;
import com.atguigu.bean.Person;
import org.springframework.context.annotation.*;

@Configuration

@ComponentScan(value="com.atguigu",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)
//       , @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes = BookService.class)
//        ,
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
})
public class MainConfig {
    @Bean("person")
    public Person getPerson(){
        return new Person("уехЩ",108);
    }

}
