package com.gage.DesignPattern.StructuralPatterns.proxy.CGLib;

public class User {
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("执行加法操作: " + a + " + " + b + " = " + result);
        return result;
    }
}
