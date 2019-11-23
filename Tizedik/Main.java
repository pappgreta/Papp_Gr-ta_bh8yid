/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tizedik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Main {
    
    public static Autó[] a;
    
    public static ArrayList<Autó> legnagyobbTeljesítmény(ArrayList<Autó> a){
        Collections.sort(a);
        
        if(a.size()<3) {
            return a;
        }
        
        ArrayList<Autó> lista=new ArrayList<Autó>();
         
       
        
        if(a.size()>=3) {
          for(int i=0;i<3;i++){
            lista.add(a.get(i));
           }
          return lista;
        }
        
        return null;
        
    }
    
    
    public static ArrayList<Teherautó> teherbírás(Autó [] a) {
        ArrayList<Teherautó> t=new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            if(a[i] instanceof Teherautó) {
                Teherautó te=(Teherautó) a[i];
                    if(te.getTeherbírás()>2000){
                        t.add(te);
                    }
            } 
        }
        
         return t;
    }
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        
        a=new Autó[4];
        for(int i=0;i<4;i++) {
            String sor=sc.nextLine();
            String st[]=sor.split(" ");
               if(i<2){
                    a[i]=new Autó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]));
               }
                else {
                   a[i]=new Teherautó(st[0],Integer.parseInt(st[1]),Boolean.parseBoolean(st[2]),Integer.parseInt(st[3]));
               }
        }
        
        
        for (Autó c : a) {
            System.out.println(c);
        }
       
        ArrayList<Teherautó> kiirom=teherbírás(a);
        for (Teherautó kiirom1 : kiirom) {
            System.out.println(kiirom1);
        }
            System.out.println(Autó.db);
        }
        
        
    }


