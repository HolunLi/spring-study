package com.holun.dao;

import com.holun.dao.impl.UserMapperImpl;
import com.holun.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {
    @Test
    public void testQueryAllUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        List<User> list = userMapper.queryAllUser();
        list.forEach(System.out :: println);
    }
}
