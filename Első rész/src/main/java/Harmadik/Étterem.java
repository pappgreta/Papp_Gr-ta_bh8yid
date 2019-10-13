/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik;

import java.util.Arrays;

/**
 *
 * @author pappg
 */
public class Étterem extends VendéglátóIpariEgység{
    private String[] étlap;

    public Étterem(String[] étlap, String név, int férőhelyekSzáma, boolean dohányzó) {
        super(név, férőhelyekSzáma, dohányzó);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return étlap;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<étlap.length;i++)
        {
            s+=étlap[i];
        }
        return "{"+getNév()+";"+s+";"+getFérőhelyekSzáma()+";"+isDohányzó()+"}";
    }

   
   

    
    
    
    
    
}
