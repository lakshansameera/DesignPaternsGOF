package com.patterns.TOGFFactory;

public class SavingsAccount implements Account {

    @Override
    public void open() {
        System.out.println("Savings Account Created");
    }
}
