package com.gage.DesignPattern.StructuralPatterns.proxy.StaticProxy;

public class OrderServiceProxy {
    private IOrderService iOrderService = null;
    private int router;

    public int saveOrder(Order order) {
        beforeMethod(order);
        int result = iOrderService.saveOrder(router);
        afterMethod(order);
        return result;
    }

    public void beforeMethod(Order order) {
        System.out.println("before");
        iOrderService = new OrderServiceImpl();
        int id = order.getOrderId();
        this.router = id % 2;
    }

    public void afterMethod(Order order) {
        System.out.println("after");
        // eg. 向消息队列通知
    }
}
