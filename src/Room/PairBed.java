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
public class PairBed implements Room {
    private String typeRoom;
    private float cost;
    
    public PairBed() {
        typeRoom = "Pair Bed Room";
        cost = 500;
    }
    @Override
    public float costRoom() {
        return cost;
    }

    @Override
    public String typeRoom() {
        return typeRoom;
    }
    
}
