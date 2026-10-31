package com.patterns.chainOfResponsibility;

public class RoleCheckHandler extends Handler{

    @Override
    public boolean handle(String username, String password) {
        if(!"admin".equals(username)){
            System.out.println("Not an admin");
        }
        System.out.println("Loading Default Page......");
        return handleNext(username, password);
    }
}
