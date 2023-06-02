package com.gage.DesignPattern.StructuralPatterns.adapter.ClassAdapter;

import com.gage.DesignPattern.StructuralPatterns.adapter.ObjectAdapter.Duck;
import com.gage.DesignPattern.StructuralPatterns.adapter.ObjectAdapter.WildCock;

public class CockAdapter extends WildCock implements Duck {

    @Override
    public void GuaGua() {
        // 让鸡有鸭子的功能
        System.out.println("鸭子让鸡叫");
        super.GuGu();
    }
}
