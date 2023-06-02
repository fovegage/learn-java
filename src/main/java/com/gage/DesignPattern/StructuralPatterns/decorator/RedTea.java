package com.gage.DesignPattern.StructuralPatterns.decorator;

public class RedTea extends Tea {
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 11.23;
    }
}
