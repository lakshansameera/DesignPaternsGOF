package com.examples.ex2;

public class FixedDepositInterest implements InterestStrategy{

    @Override
    public double calculateInterest(double balance) {
        return balance * (8.00/100.00);
    }
}
