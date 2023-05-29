package com.gage.base.oop;

public class VisitAuthority {
    public int publicField;
    private int privateField;
    protected int protectedField;
    int defaultField; // 默认访问修饰符（包级访问）

    public void publicMethod() {
        // 可以在任何地方访问
    }

    private void privateMethod() {
        // 只能在当前类中访问
    }

    protected void protectedMethod() {
        // 可以在当前类、子类和同一包中访问
    }

    void defaultMethod() {
        // 只能在同一包中访问
    }
}
