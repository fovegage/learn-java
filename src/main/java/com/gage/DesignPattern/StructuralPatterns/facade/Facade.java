package com.gage.DesignPattern.StructuralPatterns.facade;

public class Facade {

    private final OrderService orderService = new OrderService();

    private final UserService userService = new UserService();

    public void order() {
        if (orderService.isSuccess()) {
            System.out.println(userService.getInfo());
        }
    }
}
