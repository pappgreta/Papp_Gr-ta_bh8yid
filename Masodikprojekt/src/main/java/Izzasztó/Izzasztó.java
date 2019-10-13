/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Izzasztó;

/**
 *
 * @author pappg
 */
public class Izzasztó {
    private String nev;
    private int hom;

    public Izzasztó(String nev, int hom) {
        this.nev = nev;
        this.hom = hom;
    }

    @Override
    public String toString() {
        return nev + " (" + hom + ")";
    }

    public String getNev() {
        return nev;
    }

    public int getHom() {
        return hom;
    }
    
    
    
}
