package com.patterns.BILLPUGHHOLDER;

public class Login {
    private String username = "username";
    private String password = "password";

    private Login() {

    }

    private static class LoginHelper{
        private static final Login INSTANCE = new Login();
    }

    public static Login getInstance() {

        return LoginHelper.INSTANCE;
    }

    public boolean validateUser(String user, String password) {
        return this.username.equals(user)
                && this.password.equals(password);
    }
}
