package com.examples.ex1;

public class Demo {

    public static void main(String args[]){
        PaymentProcess process = new PaymentProcess(new BankTransfer());
        process.pay(3000);

        process.setMethod(new Card());
        process.pay(6000);
    }
}
