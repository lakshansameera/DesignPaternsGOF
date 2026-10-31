package com.patterns.singleton;

import java.sql.SQLOutput;

public class Demo {

    public static void main(String []args){

        Thread t1 = new Thread(() -> {
            System.out.println(Login.getInstance());
        });

        Thread t2 = new Thread(() -> {
            System.out.println(Login.getInstance());
        });

        t1.start();
        t2.start();

    }
}
