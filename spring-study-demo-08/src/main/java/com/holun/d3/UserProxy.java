package com.holun.d3;

import org.aspectj.lang.ProceedingJoinPoint;

//增强类
public class UserProxy {
    public void fun1() {
        System.out.println("before...");
    }

    public void fun2(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕增强之前...");
        proceedingJoinPoint.proceed();
        System.out.println("环绕增强之后...");
    }
}
