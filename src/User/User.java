package User;


import Login.Login;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class User {
    private static ArrayList<Login> user = new ArrayList<>();
    
    public User() {}
    
    public static ArrayList<Login> getAllUser() {
        return user;
    }
    public static void addUser(Login lg) {
        getAllUser().add(lg);
    }
    
}
