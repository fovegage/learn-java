package com.gage.base.oop.SuperTest;

public class Child extends Parent {
    public void childMethod() {
        // 获取父类的方法
        super.parentMethod();
        System.out.println("child");
    }
}
