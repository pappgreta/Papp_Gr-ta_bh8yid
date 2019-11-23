/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Első;

/**
 *
 * @author pappg
 */
public class ErjedtGyumolcs extends Gyumolcs implements Alkoholos {
    private double alkoholTartalom;

    public ErjedtGyumolcs(double alkoholTartalom, String íz, String fajta) {
        super(íz, fajta);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
       return mennyiAlkoholtTartalmaz();
    }

    @Override
    public String toString() {
        return "Alkoholtartalom="+ alkoholTartalom;
    }
    
    
    
    

    
    
    
    
}
