package com.gage.DesignPattern.StructuralPatterns.proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OrderInvocationHandler implements InvocationHandler {
    private Object target;

    public OrderInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        // target 实例化的类
        // 改类的函数签名
        Object result = method.invoke(target, args);
        afterMethod();
        return result;
    }


    public void beforeMethod() {
        System.out.println("before");
    }

    public void afterMethod() {
        System.out.println("after");
    }
}
