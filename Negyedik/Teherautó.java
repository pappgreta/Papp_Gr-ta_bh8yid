/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negyedik;



/**
 *
 * @author pappg
 */
public class Teherautó extends Autó{
    private int maxSzállíthatóTeher;

    public Teherautó(int maxSzállíthatóTeher, String rendszám, int motorTeljesítmény) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return maxSzállíthatóTeher + " "+getRendszám();
    }

   
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Teherautó))
            return false;
        Teherautó t = (Teherautó) obj;
        if(this.maxSzállíthatóTeher==t.maxSzállíthatóTeher)
            return true;
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    
}
