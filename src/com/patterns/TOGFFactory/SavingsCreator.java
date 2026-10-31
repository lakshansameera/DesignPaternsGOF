package com.patterns.TOGFFactory;

public class SavingsCreator extends AccountCreator {

    @Override
    public Account createAccount() {
        return new SavingsAccount();
    }
}
