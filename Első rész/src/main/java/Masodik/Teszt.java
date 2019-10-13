/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masodik;

/**
 *
 * @author pappg
 */
public class Teszt {
    public static void main(String[] args) {
        Triangle t = new Triangle(1, 1.5,1, "yellow", true);
        
        System.out.println("szín:"+t.getColor()+ " kitöltés:"+t.isFilled());
        System.out.println("Kerület:"+t.getArea());
        System.out.println("Terület:"+t.getPerimeter());
        
    }
    
}
