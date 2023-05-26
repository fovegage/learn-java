package com.gage.DesignPattern.StructuralPatterns.bridge;

public class CreditAccount implements Account {
    @Override
    public Account openAccount() {
        return new CreditAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("信用卡账户");
    }
}
