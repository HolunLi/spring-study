package com.holun.d3;

public class Test {
    public static void main(String[] args) {
        //创建目标对象
        UserService userService = new UserServiceImpl();
        //创建InvocationHandler对象(调用处理器)。调用处理器会自动调用其invoke()方法
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        //获取代理对象
        UserService proxy = (UserService) userServiceProxy.getProxy();
        proxy.add("李豪伦");
        proxy.delete();
    }
}
