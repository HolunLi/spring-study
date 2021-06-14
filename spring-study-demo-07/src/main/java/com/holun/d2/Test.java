package com.holun.d2;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建目标对象
        UserService userService = new UserServiceImpl();
        //创建InvocationHandler对象(调用处理器)。调用处理器会自动调用其invoke()方法
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        //创建代理对象。三个参数: 目标对象的类加载器,目标对象实现的接口和调用处理器
        UserService proxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), userServiceProxy);
        proxy.add(); //当代理对象调用add()方法,调用处理器会自动调用其invoke方法，invoke方法中的参数Method就是这里的add方法。
        proxy.add("李豪伦");
        proxy.query();

        //我们还可以看一下动态生成的代理类的名字
        System.out.println(proxy.getClass().getName());
    }
}
