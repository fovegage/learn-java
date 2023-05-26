package com.gage.DesignPattern.StructuralPatterns.bridge;

public class ABCBank extends Bank {
    public ABCBank(Account account) {
        // 子类必须构造
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账户");
        account.openAccount();
        return account;
    }
}
