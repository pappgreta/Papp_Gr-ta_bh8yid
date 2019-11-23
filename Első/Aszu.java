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
public class Aszu extends Bor{
    
    private int puttonySzam;

    public int getPuttonySzam() {
        return puttonySzam;
    }
    
     public void setPuttonySzam(int puttonySzam) {
        this.puttonySzam = puttonySzam;
    }


    public Aszu(int puttonySzam, String szoloFajta, String termoTerulet, String íz, double alkoholTartalom) {
        super(szoloFajta, termoTerulet, íz, alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }
    
    private int hanyPuttonyszam()
    {
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Puttonyszám=" + puttonySzam;
    }
    
    
    
    

   
    
    
    
}
