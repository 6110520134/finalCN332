package Client;

import Authentication.*;
import Login.*;
import User.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Acer
 */
public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hotel.com");
        System.out.print("Do you have account? (y/n) : ");
        String haveAcc = sc.nextLine();
        Login lg = null;
        System.out.println(haveAcc);
        if ("y".equals(haveAcc)) {
            System.out.print("Choose method to login:\n[F]acebook\n[G]oogle\n[E]mail\n:");
            String s = sc.nextLine();
            if (s.equals("F")) {
                lg = new Facebook();
                lg.login("facebook");
            } else if (s.equals("G")) {
                lg = new Google();
                lg.login("google");
            } else if (s.equals("E")) {
                lg = new Email();
                lg.login("email");
            }
        } else if ("n".equals(haveAcc)) {
            System.out.print("Choose method to register:\n[F]acebook\n[G]oogle\n[E]mail\n:");
            String s1 = sc.nextLine();
            switch (s1) {
                case "F":
                    lg = new Facebook();
                    break;
                case "G":
                    lg = new Google();
                    break;
                case "E":
                    lg = new Email();
                    break;
            }
            System.out.print("Choose method to authenticate:\n[P]assword\n[T]2-Step\n[F]ace Detect\n[B]iometric\n:");
            String s2 = sc.nextLine();
            Authentication au = null;
            switch (s2) {
                case "P":
                    au = new Password();
                    break;
                case "T":
                    au = new TwoStep();
                    break;
                case "F":
                    au = new FaceDetect();
                    break;
                case "B":
                    au = new Biometric();
                    break;
            }
            lg.setAuthen(au);
            User.addUser(lg);
            lg.login(lg.getUser());
        }

        if (lg.getIsLogin()) {
            System.out.println("Input Your room.");
        }
    }
}
