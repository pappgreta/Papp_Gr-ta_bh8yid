/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Budapestkupa;

import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Main {
    private static Budapestkupa[] tomb;
    
    static void rendez(Budapestkupa t[])
    {
        for(int i=0;i<t.length-1;i++)
            for(int j=i+1;j<t.length;j++){
                if(t[i].getResztav()==t[j].getResztav())
                    if(t[i].getEv()==t[j].getEv()){
                        if(t[i].getHonap()==t[j].getHonap()){
                            if(t[i].getNap()==t[j].getNap()){
                                if(t[i].getNev().compareTo(t[j].getNev())>1){
                                    Budapestkupa tmp=t[i];
                                    t[i]=t[j];
                                    t[j]=tmp;
                                }
                                else if(t[i].getNap()>t[j].getNap()){
                                    Budapestkupa tmp=t[i];
                                    t[i]=t[j];
                                    t[j]=tmp;
                                }
                                    
                                
                                    
                            }
                            else if(t[i].getHonap()>t[j].getHonap()){
                                Budapestkupa tmp=t[i];
                                t[i]=t[j];
                                t[j]=tmp;
                            }
                        }
                        else if(t[i].getEv()>t[j].getEv()){
                            Budapestkupa tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                            
                    }
                    else if(t[i].getResztav()>t[j].getResztav()){
                        Budapestkupa tmp=t[i];
                        t[i]=t[j];
                        t[j]=tmp;
                    }
            }
    
    }
    
    static void kiir(Budapestkupa [] b)
    {
        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
    }
                
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        String[] Resztav=new String[db];
        for (int i = 0; i < db; i++) {
            Scanner sor = new Scanner(sc.nextLine()).useDelimiter(";");
            String resztav=sor.next();
            Resztav[i]=resztav;
            
        }
        for (int i = 4; i < db; i++) {
            db++;
            
        }
        tomb=new Budapestkupa[db];
        for (int i = 0; i < tomb.length; i++){
            String sor =sc.nextLine();
            String [] tmp=sor.split(";");
            tomb[i]=new Budapestkupa(Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2]),tmp[3],Integer.parseInt(tmp[4]));
        }
        
        rendez(tomb);
        kiir(tomb);
    }
}
