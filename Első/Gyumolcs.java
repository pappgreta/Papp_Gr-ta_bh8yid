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
public class Gyumolcs {
    private String íz;
    private String fajta;

    public String getÍz() {
        return íz;
    }

    public void setÍz(String íz) {
        this.íz = íz;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }
    
    

    public Gyumolcs(String íz, String fajta) {
        this.íz = íz;
        this.fajta = fajta;
    }

    public String milyenIz()
    {
        return íz;
    }
    public String milyenFajta()
    {
        return fajta;
    }

    @Override
    public String toString() {
        return "Íz="+íz+"; Fajta="+fajta;
                }
    
    
    
}
