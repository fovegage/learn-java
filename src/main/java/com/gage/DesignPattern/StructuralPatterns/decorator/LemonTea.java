package com.gage.DesignPattern.StructuralPatterns.decorator;

public class LemonTea extends CustomCondiment {

    private Tea tea;

    public LemonTea(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + "加过柠檬的茶";
    }

    @Override
    public double cost() {
        return tea.cost() + 1.2;
    }
}
