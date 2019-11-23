/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizenketto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        ArrayList<Hozzavalok> li = new ArrayList();
       
        while(sc.hasNextLine())
        {
           
            String [] sor = sc.nextLine().split(";");
                    Hozzavalok h = new Hozzavalok(sor[0], Integer.parseInt(sor[1]));
           
                    if(li.contains(h)) //tartalmazza-e a lista az elemet
                    {
                        int idx = li.indexOf(h);  //az elem helyét adja vissza
                       
                        li.get(idx).setMennyiség(li.get(idx).getMennyiség()+Integer.parseInt(sor[1]));   //le tudok kérdezni a listából egy adott elemet, hozzávalót -->megegyezik a nevével (pl. paradicsom)
                    }
                    else
                    {
                        li.add(h);
                    }
        }
       
        Collections.sort(li);
       
        for(Hozzavalok i:li)
            System.out.println(i);
       
       
       
    }
   
   

    
}
