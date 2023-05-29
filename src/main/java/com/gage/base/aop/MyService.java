package com.gage.base.aop;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void doSomething() {
        System.out.println("hello world");
    }
}
