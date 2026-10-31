package com.patterns.Factory;

public class AccountFactory {

    public Account createAccount(String type)  {
        if (type == null){
            throw new IllegalArgumentException("AccountCreator Type Can not be NUll");
        }

        if (type.equals("SAVINGS")){
            return new SavingsAccount();
        } else if (type.equals("TERMDEPOSIT")  || type.equals("FIXED"))  {
            return new TermDepositAccount();
        }
        else if (type.equals("CURRENT")){
            return new CurrentAccount();
        }
        else if (type.equals("STUDENT")){
            return new Student();
        }
        else {
            throw new IllegalArgumentException("Invalid AccountCreator Type " + type);
        }

    }
}
