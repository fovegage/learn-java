package com.gage.DesignPattern.strategy;

public class StrategyPattern {
    // 策略模式

    private final ISite iSite;

    public StrategyPattern(ISite iSite) {
        this.iSite = iSite;
    }

    public void execute(String param) {
        iSite.getSign(param);
    }


}

