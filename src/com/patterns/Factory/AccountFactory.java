package com.patterns.Factory;

public class AccountFactory {

    public Account createAccount(String type) throws Exception {
        if (type.equals("SAVINGS")){
            return new SavingsAccount();
        } else if (type.equals("TERMDEPOSIT")) {
            return new TermDepositAccount();
        }
        else if (type.equals("CURRENT")){
            return new CurrentAccount();
        }
        else {
            throw new Exception("Error Occured");
        }

    }
}
