package com.gage.DesignPattern.StructuralPatterns.facade;

public class FacadePattern {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.order();

        // 统一的调用
        facade.getUser();
    }
}
