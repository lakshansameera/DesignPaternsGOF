package com.patterns.abstractFactory;

public class CoporateSavings implements Savings{

    @Override
    public void openSavings() {
        System.out.println("Coporate Savings Opened");
    }
}
