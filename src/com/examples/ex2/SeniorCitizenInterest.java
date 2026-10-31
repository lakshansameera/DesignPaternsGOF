package com.examples.ex2;

public class SeniorCitizenInterest implements InterestStrategy{
    @Override
    public double calculateInterest(double balance) {
        return balance * (10.00/100.00);
    }
}
