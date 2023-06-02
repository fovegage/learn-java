package com.gage.DesignPattern.StructuralPatterns.decorator;

public class GreenTea extends Tea {
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 0.09;
    }
}
