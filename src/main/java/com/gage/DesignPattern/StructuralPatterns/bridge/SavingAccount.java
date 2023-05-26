package com.gage.DesignPattern.StructuralPatterns.bridge;

public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("储蓄账户");
    }
}
