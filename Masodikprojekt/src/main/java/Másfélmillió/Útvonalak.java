/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Másfélmillió;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Útvonalak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int db = Integer.parseInt(sc.nextLine());
        Turazo[] tomb = new Turazo[db];
        for (int i = 0; i < tomb.length; i++) {
            String[] sor = sc.nextLine().split(";");
            tomb[i] = new Turazo(sor[0], sor[1]);
        }
        Arrays.sort(tomb);
        
        for (Turazo t : tomb) {
            System.out.println(t);
        }
    }
    
}
