package com.patterns.abstractFactory;

public class RetailLoan implements Loan{

    @Override
    public void openLoan() {
        System.out.println("Retail Loan Opened");
    }
}
