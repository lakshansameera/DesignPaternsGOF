package com.examples.ex2;

public class InterestDemo {

    public static void main (String args[]){
        InterestCalculator interst = new InterestCalculator(new SavingsInterest());
        System.out.println("Savings Interest: Rs. " +interst.calculateInterest(100000));

        interst.setStrategy(new FixedDepositInterest());
        System.out.println("Fixed Deposit Interest: Rs. " +interst.calculateInterest(100000));

        interst.setStrategy(new SeniorCitizenInterest());
        System.out.println("Senior Citizen Interest: Rs. " +interst.calculateInterest(100000));

    }
}
