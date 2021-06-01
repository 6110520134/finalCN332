package Authentication;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Biometric implements Authentication {

    private String authenticate;

    public Biometric() {
        authenticate = "biometric";
    }

    @Override
    public void authen(String user) {
        System.out.println("Authenticate with " + authenticate + " By " + user);
    }

}
