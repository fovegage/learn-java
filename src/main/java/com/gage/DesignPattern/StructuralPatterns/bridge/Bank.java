package com.gage.DesignPattern.StructuralPatterns.bridge;

public abstract class Bank {
    protected Account account;

    // 构造注入
    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
