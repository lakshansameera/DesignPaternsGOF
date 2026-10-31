package com.patterns.Factory;

public class Student implements Account{


    @Override
    public void open() {
        System.out.println("Opened Student AccountCreator");
    }
}
