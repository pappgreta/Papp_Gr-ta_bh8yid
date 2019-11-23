/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Első;

/**
 *
 * @author pappg
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    
    public String íz;
    public double alkoholTartalom;

    public AlkoholosItal(String íz, double alkoholTartalom) {
        this.íz = íz;
        this.alkoholTartalom = alkoholTartalom;
    }

    public String getÍz() {
        return íz;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }
    
    public abstract String milyenÍzű();

    @Override
    public String toString() {
        return íz+" "+alkoholTartalom;
    }

    public double mennyiAlkoholtTartalmaz()
    {
        return alkoholTartalom;
    }
    
    public String milyenIzu()
    {
        return íz;
    }
    
}
