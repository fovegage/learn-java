package com.gage.DesignPattern.StructuralPatterns.bridge;

public class BridgePattern {

    public static void main(String[] args) {
        // abc
        Bank abc = new ABCBank(new CreditAccount());
        Account account1 = abc.openAccount();
        account1.showAccountType();

        // ICBC
        Bank icbc = new ICBCBank(new CreditAccount());
        Account account2 = icbc.openAccount();
        account2.showAccountType();
    }
}
