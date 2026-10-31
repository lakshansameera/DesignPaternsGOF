package com.patterns.Factory;

public class Demo {

    public static void main (String []args) throws Exception {

        AccountFactory savings = new AccountFactory();
        savings.createAccount("SAVINGS").open();

        AccountFactory current = new AccountFactory();
        current.createAccount("CURRENT").open();
    }
}
