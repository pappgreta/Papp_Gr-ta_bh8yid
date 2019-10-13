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
public class Nyilas extends Katona{
    private int range;

    public Nyilas(int atk, int def, int range) {
        super(atk, def);
        this.range = range;
    }

    @Override
    public int getAtk() {
        return super.getAtk()+range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
    
    
    @Override
    public String toString() {
        return "Nyilas: TE:" + getAtk() + " VE:" + getDef();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || (!(obj instanceof Nyilas)))
            return false;
        
        Nyilas ny = (Nyilas) obj;
        
        return this.getAtk()==ny.getAtk() && this.getDef()==ny.getDef() && this.range==ny.getRange();
    }
    
}
