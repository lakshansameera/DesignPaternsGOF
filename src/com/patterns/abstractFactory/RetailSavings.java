package com.patterns.abstractFactory;

public class RetailSavings implements Savings{


    @Override
    public void openSavings() {
        System.out.println("Retail Savings Account Opened");
    }
}
