package com.patterns.chainOfResponsibility;

import javax.xml.crypto.Data;

public class ValidPasswordHandler extends Handler{

    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidPassword(username, password)){
            System.out.println("Invalid Password");
            return false;
        }
        return handleNext(username, password);
    }
}
