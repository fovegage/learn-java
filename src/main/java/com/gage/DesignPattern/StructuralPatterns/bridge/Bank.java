package com.gage.DesignPattern.StructuralPatterns.bridge;

public abstract class Bank {
    private Account account;

    // 构造注入
    Bank(Account account) {
        this.account = account;
    }

    public Account openAccount(){
        return this.account;
    }
}
