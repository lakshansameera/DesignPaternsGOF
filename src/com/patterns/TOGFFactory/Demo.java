package com.patterns.TOGFFactory;

public class Demo {

    public static void main (String args[]){
        AccountCreator creator;
        creator =  new SavingsCreator();

        creator.openAccount();

        creator = new currentCreator();
        creator.openAccount();
    }
}


