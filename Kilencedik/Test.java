/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kilencedik;


import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pappg
 */
public class Test {

   
    public static ArrayList<Hátizsák> kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(ArrayList<Hátizsák> l) {
      
     
        Collections.sort(l);
        
        return l;
    }
    
        public static void main(String[] args) {
        
        ArrayList<Hátizsák> h=new ArrayList();
        
        h.add(new Hátizsák("Solognac",45,3,true) {});
        h.add(new Hátizsák("Kalenji",30,2,false) {});
        h.add(new Hátizsák("Simond",40,1,true) {});
        h.add(new Hátizsák("Forclaz",50,2,true) {});
        h.add(new Hátizsák("Caperlan",60,4,false) {});
        h.add(new Hátizsák("Nike",20,2,true) {});
        h.add(new Hátizsák("Adidas",18,1,false) {});
       
        ArrayList<Hátizsák> k=kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(h);
        
        for(Hátizsák k1 : k){
            System.out.println(k1);
        }
    
    }
}
