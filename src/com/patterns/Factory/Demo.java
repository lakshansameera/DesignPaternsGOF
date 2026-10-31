package com.patterns.Factory;

public class Demo {

    public static void main (String []args) throws Exception {

        AccountFactory factory = new AccountFactory();

        Account savings  = factory.createAccount("SAVINGS");
        savings.open();

        Account current =  factory.createAccount("FIXED");
        current.open();

        Account fixed = factory.createAccount("FIXED");
        fixed.open();

        Account student = factory.createAccount("STUDENT");
        student.open();

        Account savings2 = factory.createAccount("SAVINGS");
        System.out.println(
                "Same object? " + (savings == savings2)
        );

        try {
            factory.createAccount("UNKNOWN");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            factory.createAccount(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
