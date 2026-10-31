package com.patterns.TOGFFactory;

public class CurrentAccount implements Account{

    @Override
    public void open() {
        System.out.println("Current Account Opened");
    }
}
