package com.gage.spring.annotation;

public class MyAPP {
    @MyAutowired  // 给属性赋值 field.set(target, fieldInstance);
    private MyDependency myDependency;

    public void run() {
        MyAutowiredProcessor.process(this);
        myDependency.doSomething();
    }

    public static void main(String[] args) {
        MyAPP myAPP = new MyAPP();
        myAPP.run();
    }
}
