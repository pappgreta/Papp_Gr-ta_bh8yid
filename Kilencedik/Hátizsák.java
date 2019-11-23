/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kilencedik;

/**
 *
 * @author pappg
 */
public abstract class Hátizsák implements Comparable<Hátizsák>{
    
    private String márka;
    private int űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, int űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public int getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    public void setMárka(String márka) {
        this.márka = márka;
    }

    public void setŰrtartalom(int űrtartalom) {
        this.űrtartalom = űrtartalom;
    }

    public void setZsebekSzáma(int zsebekSzáma) {
        this.zsebekSzáma = zsebekSzáma;
    }

    public void setVízhatlan(boolean vízhatlan) {
        this.vízhatlan = vízhatlan;
    }
    

    @Override
    public String toString() {
        return "márka: " + márka + ", űrtartalom: " + űrtartalom + ", zsebekszáma: " + zsebekSzáma + ", vízhatlan: " + vízhatlan;
    }

    @Override
   public int compareTo(Hátizsák h) {
     if(this.márka.equals(h.getMárka())){
         return -1*Integer.compare(this.zsebekSzáma, h.zsebekSzáma);
         
     }
         return this.márka.compareTo(h.getMárka());
     
    }
        
}
