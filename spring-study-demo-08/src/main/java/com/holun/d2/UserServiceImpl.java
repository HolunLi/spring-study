package com.holun.d2;

import org.springframework.stereotype.Component;

//目标类
@Component
public class UserServiceImpl implements UserService {

    //目标方法(被增强的方法)
    public void add() {
        System.out.println("添加用户");
    }
}
