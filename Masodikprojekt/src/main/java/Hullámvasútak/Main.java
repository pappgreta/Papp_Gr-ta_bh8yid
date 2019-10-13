/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullámvasútak;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pappg
 */

    public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner (System.in);
        int db = Integer.parseInt(sc.nextLine());
        Hullamvasutak[] tomb = new Hullamvasutak[db];
        for (int i = 0; i < tomb.length; i++)
        {
            Scanner sor = new Scanner(sc.nextLine()).useDelimiter(";");
            String nev = sor.next();
            String hely=sor.next();
            int magassag = sor.nextInt();
            int varakozasiido = sor.nextInt();
            
           tomb[i] = new Hullamvasutak(nev, hely,magassag, varakozasiido);
        }
        //rendezes
        Arrays.sort (tomb);
        for (Hullamvasutak hullamvasutak : tomb)
        System.out.println(hullamvasutak);
    }
    

    
}
