package com.examples.ex1;

public class Card implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Payment made through card");
    }
}
