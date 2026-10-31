package com.patterns.TOGFFactory;

public class currentCreator extends AccountCreator{


    @Override
    public Account createAccount() {
        return new CurrentAccount();
    }
}
