/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author pappg
 */
public class Orarend {
    public static final int HÉTFŐ=1;
    public static final int KEDD=2;
    public static final int SZERDA=3;
    public static final int CSÜTÖRTÖK=4;
    public static final int PÉNTEK=5;
    
    private Ora[] Orak;
    private int számláló;
    private int nap;

    public Ora[] getOrak() {
        return Orak;
    }

    public void setOrak(Ora[] Orak) {
        this.Orak = Orak;
    }

    public int getSzámláló() {
        return számláló;
    }

    public void setSzámláló(int számláló) {
        this.számláló = számláló;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public Orarend(int nap) {
        this.számláló=0;
        this.Orak = new Ora[12]; 
        this.nap = nap;
    }
    
    
    public boolean oraHozzaad(Ora ora)
    {
        if(számláló==12)
            return false;
        for(int i=0;i<számláló;i++)
        {
            if(Orak[i].getKezdés()==ora.getKezdés())
                return false;
        }
        Orak[számláló]  = ora;
        számláló++;
        return true;
        
    }

    @Override
    public String toString() {
        return "Orak=" + Orak + ", számláló= " + számláló + ", nap=" + nap + '}';
    }
    
    
    
    
    
  
    
    
}
