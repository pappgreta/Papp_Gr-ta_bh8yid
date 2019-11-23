/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenötödik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Parkoló> lista=new ArrayList();
        
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        int db=0;
        int szamol = 0;
        
        while(sor.length()>0) {
            
            String [] st=sor.split(";");
            
            for(int i=0;i<st.length-3;i++) {
                db++;
            }
            lista.add(new Parkoló(st[0],Double.parseDouble(st[1]),Integer.parseInt(st[2]),db));
            
            
            sor=sc.nextLine();
            
        }
        Collections.sort(lista);
        for (Parkoló x : lista) {
            if(x.kapacitás-x.rendszám>3){
            System.out.println(x);
            }
        }
        
    }
}
    


