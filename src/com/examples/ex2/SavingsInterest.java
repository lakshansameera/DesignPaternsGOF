package com.examples.ex2;

public class SavingsInterest implements InterestStrategy{

    @Override
    public double calculateInterest(double balance) {
        return balance * (3.00/100.00);
    }
}
