/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullámvasútak;

/**
 *
 * @author pappg
 */
   class Hullamvasutak implements Comparable<Hullamvasutak>
{
    String nev;
    String hely;
    int magassag;
    int varakozasiido;

    public Hullamvasutak(String nev, String hely, int magassag, int varakozasiido) {
        this.nev = nev;
        this.hely = hely;
        this.magassag = magassag;
        this.varakozasiido = varakozasiido;
    }

    public String getNev() {
        return nev;
    }

    public String getHely() {
        return hely;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getVarakozasiido() {
        return varakozasiido;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setHely(String hely) {
        this.hely = hely;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag;
    }

    public void setVarakozasiido(int varakozasiido) {
        this.varakozasiido = varakozasiido;
    }

    @Override
    public String toString() {
        return nev + " (" + hely + "): " + varakozasiido;
    }
    
    

    @Override
    public int compareTo(Hullamvasutak o) {
        int kulonbseg=this.varakozasiido-o.varakozasiido;
        if(kulonbseg!=0)
            return kulonbseg;
        kulonbseg=o.magassag-this.magassag;
        if(kulonbseg!=0)
            return kulonbseg;
        return nev.compareTo(o.nev);
    }
    


}
    
