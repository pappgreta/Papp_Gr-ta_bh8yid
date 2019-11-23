/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenharmadik;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Osztálypénz>  lista= new ArrayList();                                      

        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        int uresalista=0;
        int voltalistaban;                                                     
        
        while (sor.length() > 0) {                                                     
            
            String[] st = sor.split(";");                                              
            voltalistaban=0;                                                           
            
            if(uresalista==0){                                                         
                lista.add(new Osztálypénz(st[0], Integer.parseInt(st[1])));             
                uresalista++;
            }
            else {                                                                     
         
                
                   Osztálypénz h=new Osztálypénz(st[0], Integer.parseInt(st[1]));        
                
                    for(int i=0;i<lista.size();i++){                                       
                       if(lista.get(i).getNév().compareTo(st[0])==0) {                   
                           voltalistaban++;                                              
                           int mennyi=lista.get(i).pénz;                                 
                           h.pénz+=mennyi;                                                 
                           lista.set(i, h);                                            
                       }
                     }
                   
              uresalista++;                                                            
                   
                   if(voltalistaban==0) {                                              
                       lista.add(h);
                   }
                }
               
            sor = sc.nextLine(); 
            }
        
        Collections.sort(lista);
        
        for (Osztálypénz x : lista) {
            System.out.println(x);
        }

            }

           

}
    


