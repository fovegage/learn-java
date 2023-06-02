package com.gage.DesignPattern.StructuralPatterns.facade;

public class Facade {

    private final OrderService orderService = new OrderService();

    private final UserService userService = new UserService();

    public void order() {
        if (orderService.isSuccess()) {
            System.out.println(userService.getInfo());
        }
    }

    // 也可以在门面类里进行统一的调用
    public String getUser() {
        return userService.getInfo();
    }
}
