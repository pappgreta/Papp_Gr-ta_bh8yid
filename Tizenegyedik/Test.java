/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenegyedik;

import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Test {
    public static Személy [] a; 
    
    public static void main(String[] args) {
        Személy sz=new Személy("Nagy József",40,false);
        System.out.println(sz);
        
        Hallgató h=new Hallgató("Kis Petra", 23, true, 3.3);
        System.out.println(h.jóképességű());

        Scanner sc=new Scanner(System.in);
        a=new Személy[4];
        for(int i=0;i<4;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(" ");

            if(i<2) {
             a[i]=new Hallgató(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]),Double.parseDouble(st[3]));
            }
            
            else{
              a[i]=new Oktató(st[0], Integer.parseInt(st[1]), Boolean.parseBoolean(st[2]), st[3]);
            }

        }
        System.out.println();
        for (Személy b : a) {
            System.out.println(b);
        }
        
       
    }
    
    
    

    
}
