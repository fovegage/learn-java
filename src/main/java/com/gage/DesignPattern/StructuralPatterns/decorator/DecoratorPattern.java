package com.gage.DesignPattern.StructuralPatterns.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        RedTea redTea = new RedTea();
        LemonTea lemonTea = new LemonTea(redTea);
        System.out.println(lemonTea.getDescription() + "--->" + lemonTea.cost() + "元");
    }
}
