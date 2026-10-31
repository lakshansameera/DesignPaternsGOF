package com.patterns.chainOfResponsibility;

public class userExistsHandler extends Handler{

    private Database database;

    public userExistsHandler(Database database) {
        this.database = database;
    }


    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username,password)){
            System.out.println("This username is not registered!");
            System.out.println("Sign Up to our app now!");
            return false;
        }
        return handleNext(username, password);
    }
}
