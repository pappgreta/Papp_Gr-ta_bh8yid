/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author pappg
 */
public class VendéglátóIpariEgység {
    
    private String név;
    private int férőhelyekSzáma;
    private boolean dohányzó;

    public VendéglátóIpariEgység(String név, int férőhelyekSzáma, boolean dohányzó) {
        this.név = név;
        this.férőhelyekSzáma = férőhelyekSzáma;
        this.dohányzó = dohányzó;
    }

    public String getNév() {
        return név;
    }

    public int getFérőhelyekSzáma() {
        return férőhelyekSzáma;
    }

    public boolean isDohányzó() {
        return dohányzó;
    }

    public void setDohányzó(boolean dohányzó) {
        this.dohányzó = dohányzó;
    }

    @Override
    public String toString() {
        return "Vend\u00e9gl\u00e1t\u00f3IpariEgys\u00e9g{" + "n\u00e9v=" + név + ", f\u00e9r\u0151helyekSz\u00e1ma=" + férőhelyekSzáma + ", doh\u00e1nyz\u00f3=" + dohányzó + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof VendéglátóIpariEgység))
            return false;
       
        VendéglátóIpariEgység v = (VendéglátóIpariEgység) obj;
       
        return v.getNév().equals(this.név);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        
        return hash;
    }
}