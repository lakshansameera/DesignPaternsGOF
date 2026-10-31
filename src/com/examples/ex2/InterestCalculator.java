package com.examples.ex2;

import java.util.Objects;

public class InterestCalculator {

    private InterestStrategy strategy;


    public InterestCalculator(InterestStrategy interest) {
        this.strategy = interest;
    }

    public InterestStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(InterestStrategy strategy) {
        this.strategy = Objects.requireNonNull(
                strategy,"Stratergy can not be null"
        );
    }

    public double calculateInterest(double balance){
        if(!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("Balance can not be less than 0");
        }

        return strategy.calculateInterest(balance);
    }
}
