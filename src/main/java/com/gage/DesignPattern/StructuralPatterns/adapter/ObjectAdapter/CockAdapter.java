package com.gage.DesignPattern.StructuralPatterns.adapter.ObjectAdapter;

public class CockAdapter implements Duck {
    // 让鸡有鸭子的功能

    private Cock cock;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    @Override
    public void fly() {
        cock.fly();
    }

    @Override
    public void GuaGua() {
        // 让鸡有鸭子的功能
        System.out.println("鸭子让鸡叫");
        cock.GuGu();
    }
}
