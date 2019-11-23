/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masodik;

import static Masodik.Dolgozat.italok;

/**
 *
 * @author pappg
 */
public class Dolgozat extends SzeszesItal {
    
       public Dolgozat(double alkoholTartalom, String nev, String kiszereles, int ar) {
        super(alkoholTartalom, nev, kiszereles, ar);
    }
    public static Ital [] italok(Ital [] t)
    {
       SzeszesItal[] tomb=new SzeszesItal[3];
        int szamol=0;

        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal szi=(SzeszesItal) t[i];
                  szamol++;
            }
        }
        
        SzeszesItal [] atmeneti=new SzeszesItal [szamol];
        int index=0;
        
        for(int i=0;i<t.length;i++) {
            if(t[i] instanceof SzeszesItal) {
                SzeszesItal szi=(SzeszesItal) t[i];
                  atmeneti[index]=szi;
                  index++;
            }
        }

        
        for(int i=0;i<atmeneti.length-1;i++) {
            for(int j=i+1;j<atmeneti.length;j++) {
               if(atmeneti[i].getAlkoholTartalom()<atmeneti[j].getAlkoholTartalom()) {
                    SzeszesItal tmp=atmeneti[i];
                    atmeneti[i]=atmeneti[j];
                    atmeneti[j]=tmp;
               }
            }
        }
              
        if(szamol<3) {
            return null;
        }
        else{
        tomb[0]=atmeneti[0];
        tomb[1]=atmeneti[1];
        tomb[2]=atmeneti[2];
       
        return tomb;
        }
        
              
           
   
    }
   
    public static void main(String[] args) {
        Ital[] t= new Ital[]{
        new SzeszesItal(20.3, "A", "1", 700),
        new SzeszesItal(0.0, "B", "2", 500),
        new SzeszesItal(2.0, "C", "3", 3220),
        new SzeszesItal(20.4, "D", "2", 2300),
        new SzeszesItal(20.2, "S", "1", 300)};
        
       
              
    
      
        for (Ital a : t) {
            System.out.println(a); 
        }
        
    }

 
}
