package com.gage.DesignPattern.StructuralPatterns.proxy.CGLib;

public class CGLibProxy {
    public static void main(String[] args) {
        User calculator = new User();
        UserProxy proxy = new UserProxy(calculator);
        User calculatorProxy = (User) proxy.createProxy();
        int result = calculatorProxy.add(5, 10);
        System.out.println("计算结果: " + result);
    }
}
