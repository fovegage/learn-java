package com.gage.DesignPattern.StructuralPatterns.adapter.ObjectAdapter;

public class WildCock implements Cock {
    @Override
    public void fly() {
        System.out.println("野鸡会飞");
    }

    @Override
    public void GuGu() {
        System.out.println("鸡都会咕咕叫");
    }
}
