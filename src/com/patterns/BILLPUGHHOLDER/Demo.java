package com.patterns.BILLPUGHHOLDER;

public class Demo {

    public static void main(String []args){

        Login login1 = Login.getInstance();
        Login login2 = Login.getInstance();

        System.out.println(login1==login2);

    }
}
