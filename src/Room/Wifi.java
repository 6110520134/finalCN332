/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Room;

/**
 *
 * @author Acer
 */
public class Wifi extends DecoratorRoom {
    private float cost;
    private String optional;
    
    public Wifi() {
        optional = "wi-fi";
        cost = 20;
    }
}
