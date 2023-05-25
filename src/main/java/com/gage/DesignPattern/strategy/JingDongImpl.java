package com.gage.DesignPattern.strategy;

public class JingDongImpl implements ISite{
    @Override
    public void getSign(String param) {
        System.out.println("京东签名参数：" + param);
    }
}
