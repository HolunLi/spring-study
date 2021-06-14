package com.holun.d1;

public class Test {
    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServiceImpl());
        userServiceProxy.add();
        userServiceProxy.delete();
    }
}
