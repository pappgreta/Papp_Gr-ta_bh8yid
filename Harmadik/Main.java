/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik;

import java.util.Arrays;

/**
 *
 * @author pappg
 */
  
            
public class Main {
    
      public static Kocsma[] adottItalt(String ital, VendéglátóIpariEgység[] v){

        int k=0;
        for(int i=0;i<v.length;i++)
        {
            if(v[i] instanceof Kocsma)
            {
                Kocsma ko = (Kocsma) v[i];
                //System.out.println(ko.getSörlap().length);
                for(int j=0;j<ko.getSörlap().length;j++)
                    if(ko.getSörlap()[j].equals(ital))
                        k++;
                
            }
            
        }
        
        
        Kocsma [] kocsma = new Kocsma [k];
        k=0;
        for(int i=0;i<v.length;i++)
        {
            if(v[i] instanceof Kocsma)
            {
                Kocsma ko= (Kocsma) v[i];
                for(int j=0;j<ko.getSörlap().length;j++)
                {
                    if(ko.getSörlap()[j].equals(ital))
                    {
                        kocsma [k]=ko;
                        k++;
                    }
                }
            }
            
        }
        return kocsma;

        
}
     public static void main(String[] args) {
        VendéglátóIpariEgység[] v = new VendéglátóIpariEgység[]{
       
            new Kocsma(new String[]{"kóla", "sör", "bor", "pálinka"},"Kiselefánt", 5, true),
            new Kocsma(new String[]{"kóla", "sör", "bor", "pálinka"},"Zöldbilincs", 7, true),
            new Kocsma(new String[]{"sör", "bor", "pálinka"},"Pirospohár", 10, true),
            new Kocsma(new String[]{"sör", "vodka", "pálinka"},"Pirospohár", 10, true),
            new Kocsma(new String[]{"bor", "víz"},"Poháralja", 10, true),
            new Étterem(new String[]{"rántott hús", "krumpli", "rízs", "bulgur", "alma"}, "Jóreggelt", 20, false),
            new Étterem(new String[]{"rántott hús", "rízs", "bulgur", "alma"}, "Kétkanál", 20, false),
            new Étterem(new String[]{"csirke", "krumpli", "rízs", "bulgur", "alma"}, "Ötágúvilla", 20, false),
            new Étterem(new String[]{"rántott hús", "krumpli", "rízs", "bulgur", "körte"}, "Bátorkanál", 20, false),
            new Étterem(new String[]{"rántott hús", "krumpli", "saláta", "bulgur", "alma"}, "Svédterasz", 20, false)
        };
            
            
           
       
       
        Kocsma [] k=adottItalt("sör", v);
        if (k.length > 0)
        {
            System.out.print(k[0]);
            for (int i = 1; i < k.length; i ++)
                System.out.print(", " + k[i]);
        }
        System.out.println();
    }

}
    

