package com.patterns.abstractFactory;

public class CoporateLoan implements Loan {
    @Override
    public void openLoan() {
        System.out.println("Coporate Loan Account opened");
    }
}
