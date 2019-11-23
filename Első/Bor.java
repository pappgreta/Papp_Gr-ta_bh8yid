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
public class Bor extends AlkoholosItal {

    private String szoloFajta;
    private String termoTerulet;

    public Bor(String szoloFajta, String termoTerulet, String íz, double alkoholTartalom) {
        super(íz, alkoholTartalom);
        this.szoloFajta = szoloFajta;
        this.termoTerulet = termoTerulet;
    }

    public String getSzoloFajta() {
        return szoloFajta;
    }

    public void setSzoloFajta(String szoloFajta) {
        this.szoloFajta = szoloFajta;
    }

    public String getTermoTerulet() {
        return termoTerulet;
    }

    public void setTermoTerulet(String termoTerulet) {
        this.termoTerulet = termoTerulet;
    }

    public String getIz() {
        return íz;
    }

    public void setÍz(String íz) {
        this.íz = íz;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public void setAlkoholTartalom(double alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }
    
    
    public String milyenSzolobolKeszult()
    {
        return szoloFajta;
    }
    
    public String mibolKeszult()
    {
        return szoloFajta;
    }
    
    public String holTermett()
    {
        return termoTerulet;
    }

    @Override
    public String toString() {
        return "Szőlőfajta=" + szoloFajta + ", Termőterület=" + termoTerulet;
    }

    @Override
    public String milyenÍzű() {
        return getÍz();
    }
    
    
}
