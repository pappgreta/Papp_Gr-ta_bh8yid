/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katona;

/**
 *
 * @author pappg
 */
public class Landzsas extends Katona {
    public Landzsas(int atk, int def) {
        super(atk, def);
    }    
    
    @Override
    public String toString() {
        return "Landzsas: TE:" + getAtk() + " VE:" + getDef();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (!(obj instanceof Landzsas)))
            return false;
        
        Landzsas ny = (Landzsas) obj;
        
        return this.getAtk()==ny.getAtk() && this.getDef()==ny.getDef();
    }
    
    
}
