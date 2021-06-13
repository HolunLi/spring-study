package com.holun.fig;

import com.holun.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration  //@Configuration注释的类就是一个配置类,因此MyConfiguration类就等价于MyConfiguration.xml
@ComponentScan("com.holun.pojo")  //相当于 <context:component-scan base-package="com.holun.pojo" />
public class MyConfiguration {

/*
    @Bean
    @Scope("singleton")   //等价于在MyConfiguration.xml中的 <bean id="user" class="com.holun.pojo.User" scope="singleton" />
    public User user() {
        return new User();
    }*/

}
