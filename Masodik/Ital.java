/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masodik;

import java.util.Objects;

/**
 *
 * @author pappg
 */
public class Ital implements Comparable<Ital> {
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return nev+", "+kiszereles+", "+ar+"Ft";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj==null || !(obj instanceof Ital))
        {
            return false;
        }
        
        Ital masik = (Ital) obj;
        
        if(this.nev.equals(masik.nev) && this.kiszereles.equals(masik.kiszereles))
            return true;
        else 
            return false;


    }

    @Override
    public int compareTo(Ital o) {
        return Integer.compare(this.ar, o.ar);
    }
    
}

