/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hatodik;

/**
 *
 * @author pappg
 */
public class Mintakeresés {
    
    public static boolean isConsercutiveFour(int[] values)
    {
        if(values.length>3)
       for(int i=0;i<values.length-3;i++)
       {
           if(values[i]==values[i+1] && values[i+1]==values[i+2] && values[i+2]==values[i+3])
           return true;
       }
        return false;
    }
    
    
    public static void main(String[] args) {
        int[] tomb = new int[] {20, 20, 20, 20, 50, 60, 70};
        
        
        System.out.println(isConsercutiveFour(tomb));
    }
    
}

