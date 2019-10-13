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
public class Kocsma extends VendéglátóIpariEgység{
    private String [] sörlap;

    public Kocsma(String[] sörlap, String név, int férőhelyekSzáma, boolean dohányzó) {
        super(név, férőhelyekSzáma, dohányzó);
        this.sörlap = sörlap;
    }

    public String[] getSörlap() {
        return sörlap;
    }

    

    @Override
    public String toString() {
        String s = "";
        for(int i=0;i<sörlap.length;i++)
        {
           s += sörlap[i] + " ";
        }
        return getNév()+";"+s+";"+getFérőhelyekSzáma()+";"+isDohányzó();
    }
    
     @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Kocsma))
            return false;
        Kocsma k = (Kocsma) obj;
        
        return super.equals(k) && Arrays.equals(this.sörlap, k.getSörlap());
                    
    }
}
