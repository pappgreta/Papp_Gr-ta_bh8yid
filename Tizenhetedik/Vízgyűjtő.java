/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenhetedik;


import java.util.ArrayList;

/**
 *
 * @author pappg
 */
public class Vízgyűjtő {
 
    private String név;
    private ArrayList<String> beleFolynak; 

    public Vízgyűjtő(String név) {
        this.név = név;
        this.beleFolynak= new ArrayList<>();
    }

    public String getNév() {
        return név;
    }

    public ArrayList<String> getBeleFolynak() {
        return beleFolynak;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    
  
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Vízgyűjtő)) 
            return false;
        
        Vízgyűjtő vz= (Vízgyűjtő)obj;
        return this.név.equals(vz.getNév());
        
       
    }

    @Override
    public String toString() {
        return "Vízgyűjtő{" + "név= " + név + ", v= " +  this.beleFolynak.toString() + '}';
    }

    
}
