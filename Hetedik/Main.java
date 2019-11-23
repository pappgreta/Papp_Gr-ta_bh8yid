/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hetedik;



import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author pappg
 */
public class Main {
    
    public static ArrayList<Lakóház> tágas(ArrayList<Lakóház> lh, double térfogat) {
        
        ArrayList<Lakóház> l2 = new ArrayList<>();
        for(Lakóház i:lh) 
            if(i.légköbméter()> térfogat)
                l2.add(i);
             
            return l2;
        
        
    }
    
    
    public static void main(String[] args) {
        ArrayList<Lakóház> lh= new ArrayList(); 
        lh.add(new Lakóház("Egy 1", 12, 5.6));
        lh.add(new Lakóház("Egy 2", 15, 4.6));
        lh.add(new Lakóház("Egy 3", 3, 7.6));
        lh.add(new Lakóház("Egy 4", 2, 17.6));
       
        System.out.println(lh.get(0));
        lh.add(3,new Lakóház("Egy 11", 22, 1.6));
        
   
            
        for(int i=0; i<lh.size(); i++){
            System.out.println(lh.get(i));
        }
    lh.set(0, new Lakóház("Egyetem 5", 2, 4)); 
    
        System.out.println(lh.get(0));
    
        System.out.println(lh.contains(new Lakóház("Egyetem 1", 3, 4)));
    
    
        System.out.println(lh.lastIndexOf(new Lakóház("Egyetem 3", 4, 4)));
        
        
        ArrayList<Lakóház> l3 = tágas(lh, 55);
        Collections.sort(l3);
        for(Lakóház i:l3)
            System.out.println(i);
 
    }
            
}