/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szótár;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pappg
 */
public class Main {
     public static void main(String[] args)
    {
      
        Scanner sc = new Scanner (System.in);

int db = Integer.parseInt(sc.nextLine());
for (int i = 0; i < db; ++i) {
    {
        String line = sc.nextLine();
        String[] parts= line.split(":");
        String angol=parts[0];
         List<String> angolszavak = new ArrayList<>();
         for(String szavak: angolszavak)
         {
             angolszavak.add(angol);
         
         }
         System.out.println();
         
    }
}
    }
}
