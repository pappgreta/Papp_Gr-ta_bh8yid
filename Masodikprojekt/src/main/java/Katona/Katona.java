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
public class Katona {
    
    private int atk;
    private int def;

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Katona() {
        this.atk=5;
        this.def=5;
    }

    public Katona(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    @Override
    public String toString() {
        return "TE:" + atk + "VE:" + def;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Katona))
            return false;
        
        Katona k = (Katona) obj;
        
        return this.atk==k.getAtk() && this.def==k.getDef();
    }
    
    
}
