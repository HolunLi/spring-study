package com.holun.d2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //生成代理对象
public class UserProxy {
    //抽取相同的切入点
    public static final String pointCut = "execution(* com.holun.d2.UserServiceImpl.add(..))";

    //@Before 注解的方法就是前置通知。在目标方法之前,执行前置通知
    @Before(pointCut)
    public void fun_1() {
        System.out.println("before...");
    }

    //@AfterReturning 注解的方法就是后置通知。在目标方法正常返回之后,执行后置通知。如果目标方法发生异常,后置通知不会执行
    @AfterReturning(pointCut)
    public void fun_2() {
        System.out.println("AfterReturning...");
    }

    //@After 注解的方法就是最终通知。不管目标方法是否发生异常,最终通知都会会执行
    @After(pointCut)
    public void fun_3() {
        System.out.println("After...");
    }

    //@Around 注解的方法就是最终通知。环绕通知在目标方法前后都会执行
    @Around(pointCut)
    public void fun_4(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前...");
        //执行目标方法(被增强的方法)
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");
    }

    //@AfterThrowing 注解的方法就是异常通知。异常通知在目标方法发生异常后才都会执行
    @AfterThrowing(pointCut)
    public void fun_5() {
        System.out.println("AfterThrowing...");
    }
}
