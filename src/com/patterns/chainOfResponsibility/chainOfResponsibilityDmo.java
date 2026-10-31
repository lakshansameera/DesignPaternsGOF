package com.patterns.chainOfResponsibility;

public class chainOfResponsibilityDmo {

    public static void main(String[] args){
        Database database = new Database();
        Handler handler = new userExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database)
                .setNextHandler(new RoleCheckHandler()));

        AuthService service = new AuthService(handler);
        service.logIn("user", "password");
    }
}
