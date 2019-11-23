/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harmadik;

/**
 *
 * @author pappg
 */
public class Main {
    public static void main(String[] args) {
        
        Tea k=new Tea("London Fruit",560);
        Tea l=new Tea("Saga", 255);
        
        if(k.egyenlo(l)) {
            System.out.println("egyenlő");
        }
        if(k.kisebbMint(l)){
            System.out.println("kisebb");
        }
        if(k.nagyobbMint(l)) {
            System.out.println("nagyobb");
        }
        
    }
    
    
}
