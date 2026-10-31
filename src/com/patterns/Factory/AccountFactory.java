package com.patterns.Factory;

public class AccountFactory {

    public Account createAccount(String type)  throws Exception{

        if(type.equals(null)){
            return new Exception("NUll");
        }

        else if (type.equals("SAVINGS")){
            return new SavingsAccount();
        } else if (type.equals("TERMDEPOSIT")) {
            return new TermDepositAccount();
        }
        else if (type.equals("CURRENT")){
            return new CurrentAccount();
        }

        else if(type.equals("STUDENT")){
            return new Student();
        }
        else {
            throw new IllegalArgumentException("Invalid Account Type Selected");
        }

    }
}
