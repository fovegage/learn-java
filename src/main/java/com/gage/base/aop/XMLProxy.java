package com.gage.base.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLProxy {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/applicationContext.xml");
        MyService myService = context.getBean("myService",MyService.class);
//        MyService myService = context.getBean(MyService.class);
        myService.doSomething();
    }
}
