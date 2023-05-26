package com.gage.DesignPattern.StructuralPatterns.proxy.Dynamic;

import com.gage.DesignPattern.StructuralPatterns.proxy.StaticProxy.IOrderService;
import com.gage.DesignPattern.StructuralPatterns.proxy.StaticProxy.Order;
import com.gage.DesignPattern.StructuralPatterns.proxy.StaticProxy.OrderServiceImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyPattern {
    public static void main(String[] args) {
        Order order = new Order();
        IOrderService orderService = new OrderServiceImpl();
        OrderInvocationHandler orderInvocationHandler = new OrderInvocationHandler(orderService);
        IOrderService proxy = (IOrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(), orderInvocationHandler);
        proxy.saveOrder(1);
    }
}
