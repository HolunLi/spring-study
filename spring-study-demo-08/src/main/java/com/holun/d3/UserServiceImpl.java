package com.holun.d3;

//目标类
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void add(String uname) {
        System.out.println("添加" + uname + "用户");
    }
}
