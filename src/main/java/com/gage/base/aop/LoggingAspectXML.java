package com.gage.base.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectXML {
    @Before("execution(* com.gage.base.aop.MyService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("before");
    }
    @Before("execution(* com.gage.base.aop.MyService.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("after");
    }
}
