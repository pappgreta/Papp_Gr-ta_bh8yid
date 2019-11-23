/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masodik;

/**
 *
 * @author pappg
 */
public class SzeszesItal extends Ital {
    
    private double alkoholTartalom;

    public double getAlkoholTartalom() {
        return alkoholTartalom;
        
    }

    public SzeszesItal(double alkoholTartalom, String nev, String kiszereles, int ar) {
        super(nev, kiszereles, ar);
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return alkoholTartalom+"% alkoholtartalmú, "+nev+" ,"+kiszereles+" l, "+ar+" Ft";
    }
   
    
    
    
    
    
    
}
