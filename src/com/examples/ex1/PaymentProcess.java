package com.examples.ex1;

public class PaymentProcess {

    private PaymentMethod method;

    public PaymentProcess(PaymentMethod method) {
        this.method = method;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public void pay(double amount){
        method.pay(amount);
    }
}
