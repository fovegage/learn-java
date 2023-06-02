package com.gage.DesignPattern.StructuralPatterns.adapter.ObjectAdapter;

public class ObjectAdapter {
    public static void main(String[] args) {
        // 让鸡有鸭子的功能
        Cock cock = new WildCock();
        CockAdapter cockAdapter = new CockAdapter(cock);
        cockAdapter.GuaGua();
    }
}
