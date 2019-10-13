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
public class Ora {
    private int kod;
    private String nev;
    private int kezdés;

    public Ora(int kod, String nev, int kezdés) {
        this.kod = kod;
        this.nev = nev;
        if(this.kezdés<8 &&this.kezdés>1)
            this.kezdés=8;
        if(this.kezdés>19 || this.kezdés<2)
        {
            this.kezdés=19;
        }
        this.kezdés=kezdés;
    }

    public int getKod() {
        return kod;
    }

    public String getNev() {
        return nev;
    }

    public int getKezdés() {
        return kezdés;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKezdés(int kezdés) {
        this.kezdés = kezdés;
    }
    
}
    
   
