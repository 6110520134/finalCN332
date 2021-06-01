package Login;

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
public interface Login {
    void login(String user);
    String getUser();

    public boolean getIsLogin();

    public Authentication getAuthen();

    public void setAuthen(Authentication au);
}
