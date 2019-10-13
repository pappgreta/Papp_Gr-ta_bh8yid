/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katona;

/**
 *
 * @author pappg
 */
public class Main {
     public static void megkuzd(Nyilas a, Nyilas b)
    {
        if(a.getAtk()>b.getDef())
            System.out.println("Az elso jatekos gyozott");
        
        if(a.getAtk()<b.getDef())
            System.out.println("A masodik jatekos gyozott");
        
        if(a.getAtk()==b.getDef())
            System.out.println("Az elso jatekos gyozott");
    }
    
    public static void megkuzd1(Nyilas a, Landzsas b)
    {
        if(a.getAtk()>b.getDef())
            System.out.println("Az elso jatekos gyozott");
        
        if(a.getAtk()<b.getDef())
            System.out.println("A masodik jatekos gyozott");
        
        if(a.getAtk()==b.getDef())
            System.out.println("Az elso jatekos gyozott");
    }
    
    
    public static void main(String[] args) {
        
        Nyilas ny1= new Nyilas(5,10,20);
        Nyilas ny2= new Nyilas(10,14,14);
        Landzsas l= new Landzsas(16,19);
        
        megkuzd(ny1,ny2);
        if(ny1.getAtk()>ny2.getDef())
            megkuzd1(ny1,l);
        else megkuzd1(ny2,l);
        
    }
    
}
