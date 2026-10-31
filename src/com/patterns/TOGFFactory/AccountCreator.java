package com.patterns.TOGFFactory;

public abstract class AccountCreator {

    public abstract Account createAccount();

    public void openAccount(){
        Account account = createAccount();
        account.open();
    }
}
