package com.gage.base.aop;

import org.springframework.aop.framework.ProxyFactory;

public class RawProxy {
    public static void main(String[] args) {
        // 用到的设计模式：代理模式对类进行增强
        // 装饰器模式 给目标类添加功能
        MyService myService = new MyService();
        // 创建切面
        LoggingAspect loggingAspect = new LoggingAspect();

        // 创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(myService);
        proxyFactory.addAdvice(loggingAspect);

        // 创建代理对象
        MyService proxy = (MyService) proxyFactory.getProxy();
        proxy.doSomething();
    }
}
