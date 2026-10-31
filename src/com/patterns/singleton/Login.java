package com.patterns.singleton;

public class Login {

    private volatile static Login login;
    private String username = "username";
    private String password = "password";

    private Login() {

    }


    public static Login getInstance(){
        if (login == null){
            synchronized (Login.class) {
                if (login == null){
                    login = new Login();
                }
                else{
                    return login;
                }

            }
            return login;
        }

        return login;
    }

    public boolean validateUser(String user, String password){
        if ((user.equals(this.username))&&(password.equals(this.password))){
            return true;
        }
        else{
            return false;
        }
    }
}
