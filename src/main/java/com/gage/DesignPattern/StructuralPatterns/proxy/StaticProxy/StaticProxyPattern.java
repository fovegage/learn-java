package com.gage.DesignPattern.StructuralPatterns.proxy.StaticProxy;

public class StaticProxyPattern {
    public static void main(String[] args) {
        Order order = new Order();
        OrderServiceProxy orderServiceProxy = new OrderServiceProxy();
        orderServiceProxy.saveOrder(order);
    }
}
