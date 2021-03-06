package com.holun.d2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理，生成代理类
 */

public class UserServiceProxy implements InvocationHandler {
    //目标对象
    private Object target;

    //通过构造方法动态的传入目标对象
    public UserServiceProxy(Object target) {
        this.target = target;
    }

    //动态的修改目标对象
    public void setTarget(Object target) {
        this.target = target;
    }

    //在InvocationHandler对象的invoke方法中编写代理类要完成的功能
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        System.out.println("[debug] " + method.getName());
        //执行目标对象的方法。目标对象可能有多个方法,具体执行哪个方法，取决于代理对象调用哪个方法。
        res = method.invoke(target, args);
        return res; //res是method.invoke方法的返回值，同样也是目标方法的返回值。
    }
}
