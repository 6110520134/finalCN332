package Login;

import User.User;
import Authentication.Authentication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Email implements Login {

    private boolean isLogin;
    private String user;
    private Authentication authen;

    public Email() {
        isLogin = false;
    }

    public Email(String user, Authentication au) {
        this.user = user;
        authen = au;
        isLogin = false;
    }

    @Override
    public void login(String user) {
        for (int i = 0; i < User.getAllUser().size(); i++) {
            if (User.getAllUser().get(i).getUser() == user) {
                authen = User.getAllUser().get(i).getAuthen();
                isLogin = true;
                authen.authen(user);
                break;
            }
        }

        if (isLogin) {
            System.out.println("Login Successfully.");
        } else {
            System.out.println("Your Account does exist");
        }
    }

    public void register(Authentication au) {
        user = "email";
        authen = au;
        User.addUser(new Email(user, au));
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public boolean getIsLogin() {
        return isLogin;
    }

    @Override
    public Authentication getAuthen() {
        return authen;
    }

    @Override
    public void setAuthen(Authentication au) {
        authen = au;
    }
}
