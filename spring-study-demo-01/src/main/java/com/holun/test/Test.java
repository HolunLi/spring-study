package com.holun.test;

import com.holun.beans.Student;
import com.holun.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //获取spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User name1 = (User) context.getBean("u1");
        User name2 = (User) context.getBean("user_2");
        User name3 = (User) context.getBean("user_3");
        User name4 = (User) context.getBean("u4");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);

        Student student  = (Student) context.getBean("stu_1");
        System.out.println(student.getUser());
    }
}
