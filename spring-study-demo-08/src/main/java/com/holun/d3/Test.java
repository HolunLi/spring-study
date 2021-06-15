package com.holun.d3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        //注意此时getBean获取的不再是UserServiceImpl类的实例,而是代理类的实例(代理对象)
        UserService userService = context.getBean("userService", UserService.class);
        userService.add("李豪伦");
        userService.add();
    }
}
