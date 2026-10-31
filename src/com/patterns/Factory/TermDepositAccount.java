package com.patterns.Factory;

public class TermDepositAccount implements Account{

    @Override
    public void open() {
        System.out.println("Term Deposit Account");
    }
}
