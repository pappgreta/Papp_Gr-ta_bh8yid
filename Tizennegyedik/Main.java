/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizennegyedik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Zheredmenyek> zh=new ArrayList();
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        
        int ures=0;
        int volt;
        
        while(sor.length()>0) {
            
            String [] st=sor.split(";");
            volt=0;
            
            if(ures==0) {
                zh.add(new Zheredmenyek(st[0], Integer.parseInt(st[1])));
                ures++;
            }
            
            else {
                Zheredmenyek valt=new Zheredmenyek(st[0], Integer.parseInt(st[1]));
                for(int i=0;i<zh.size();i++) {
                    if(zh.get(i).getNév().compareTo(st[0])==0) {
                        volt++;
                        int p=zh.get(i).pont;
                        valt.pont=valt.pont+p;
                        zh.set(i, valt);
                    }
                }
                ures++;
                
                if(volt==0){
                    zh.add(valt);
                }
                
            }
            
            sor=sc.nextLine();
            
        }
        Collections.sort(zh);
        for (Zheredmenyek x : zh) {
            System.out.println(x);
        }
        
    }
    
}
    
