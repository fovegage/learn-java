package com.gage.DesignPattern.BehavioralPatterns.strategy;

public class Test {

    public static void main(String[] args) {
        StrategyPattern strategyPattern = new StrategyPattern(new TaoBaoImpl());
        strategyPattern.execute("x-sign");
    }
}
