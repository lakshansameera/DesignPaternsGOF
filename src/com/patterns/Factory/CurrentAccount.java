package com.patterns.Factory;

public class CurrentAccount implements Account{

    @Override
    public void open() {
        System.out.println("Current AccountCreator");
    }
}
