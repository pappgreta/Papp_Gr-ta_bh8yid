/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Izzasztó;

import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Teszt {
    private static Izzasztó[] tomb;
    
    static void rendez(Izzasztó[] t)
    {
        for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++)
            {
                if(t[i].getHom()==t[j].getHom())
                    if(t[i].getNev().compareTo(t[j].getNev())>1){
                        Izzasztó tmp=t[i];
                        t[i]=t[j];
                        tmp=t[j];
                    }
                else 
                        if(t[i].getHom()<t[j].getHom())
                    {
                        Izzasztó tmp=t[i];
                        t[i]=t[j];
                        tmp=t[j];
                    }
                
            }
    }
    
    static void kiir(Izzasztó[] t)
    {
        for(int i=0;i<t.length;i++)
            System.out.println(t[i].toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] elso = sc.nextLine().split(" ");
        int db = Integer.parseInt(elso[0]);
        String keresendo = elso[1];
        tomb = new Izzasztó[db];
        for (int i = 0; i < tomb.length; i++) {
            String[] tobbi = sc.nextLine().split(":");
            tomb[i] = new Izzasztó(tobbi[0], Integer.parseInt(tobbi[1]));
        }
        
        rendez(tomb);
        
        int index = -1;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i].getNev().equals(keresendo)) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            for (int i = (index + 1); i < tomb.length; i++) {
                
                if (tomb[i].getHom() > tomb[index].getHom()) {
                    System.out.println(tomb[i]);
                }
            }
        } else {
            System.out.println("Missing data");
        }
        
    }
    
}
