/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negyedik;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pappg
 */
public class Autó {
    private String rendszám;
    private int motorTeljesítmény;
    private Date gyártásDátuma;

    public Autó(String rendszám, int motorTeljesítmény) {
        this.rendszám = rendszám;
        this.motorTeljesítmény = motorTeljesítmény;
        this.gyártásDátuma = new Date();
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getMotorTeljesítmény() {
        return motorTeljesítmény;
    }

    public Date getGyártásDátuma() {
        return gyártásDátuma;
    }

    public void setRendszám(String rendszám) {
        this.rendszám = rendszám;
    }

    @Override
    public String toString() {
        return  rendszám + ", motorTeljes\u00edtm\u00e9ny=" + motorTeljesítmény + ", gy\u00e1rt\u00e1sD\u00e1tuma=" + gyártásDátuma + '}';
    }

  
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Autó))
            return false;
        
        Autó a = (Autó) obj;
        if(this.rendszám.equals(a.rendszám))
            return true;
        
        return a.getRendszám().equals(this.rendszám);
        
    
    }
    
    
}
