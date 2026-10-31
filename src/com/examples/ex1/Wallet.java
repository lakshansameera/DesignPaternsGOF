package com.examples.ex1;

public class Wallet implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Payment made through wallet");
    }
}
