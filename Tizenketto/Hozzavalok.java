/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenketto;

import java.util.Objects;

/**
 *
 * @author pappg
 */

    class Hozzavalok implements Comparable<Hozzavalok>
{
   
    private String név;
    private int mennyiség;
   

    public Hozzavalok(String név, int mennyiség) {
        this.név = név;
        this.mennyiség = mennyiség;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    @Override
    public String toString() {
        return this.név +";"+this.mennyiség;
    }

    @Override
    public int compareTo(Hozzavalok o) {
        if(this.mennyiség==o.getMennyiség())
            return this.név.compareTo(o.getNév());
        else
            return (-1)*Integer.compare(this.mennyiség, o.getMennyiség());
    }

    @Override
    public boolean equals(Object obj) {
      if(obj==null || !(obj instanceof Hozzavalok))
          return false;
      Hozzavalok h = (Hozzavalok) obj;
     
      return this.név.equals(h.getNév());
     
     
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.név);
        return hash;
    }
   

   
}
    

