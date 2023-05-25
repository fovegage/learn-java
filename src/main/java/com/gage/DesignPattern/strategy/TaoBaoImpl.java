package com.gage.DesignPattern.strategy;

public class TaoBaoImpl implements ISite {
    @Override
    public void getSign(String param) {
        System.out.println("淘宝签名参数：" + param);
    }
}
