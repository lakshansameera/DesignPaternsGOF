package com.patterns.Factory;

public class SavingsAccount implements Account{

    @Override
    public void open() {
        System.out.println("Savings AccountCreator");;
    }
}
