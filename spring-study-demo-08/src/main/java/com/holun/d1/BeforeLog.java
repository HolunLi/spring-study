package com.holun.d1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    //method 是要执行的目标对象的方法
    //args 用来存放方法的参数
    //target 是目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getSimpleName() + "的" + method.getName() + "方法被执行了!");
    }
}
