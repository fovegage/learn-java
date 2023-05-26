package com.gage.DesignPattern.StructuralPatterns.bridge;

public class ICBCBank extends Bank{
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账户");
        account.openAccount();
        return this.account;
    }
}
