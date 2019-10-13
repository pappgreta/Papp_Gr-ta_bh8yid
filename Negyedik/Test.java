/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negyedik;

/**
 *
 * @author pappg
 */


public class Test {
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher)
    {
        for(int i=0;i<teher.length-1;i++)
            for(int j=i+1;j<teher.length;j++)
            {
                if(teher[i].getMaxSzállíthatóTeher()>teher[j].getMaxSzállíthatóTeher())
                {
                    Teherautó tmp = teher[i];
                    teher[i]=teher[j];
                    teher[j]=tmp;
                }
            }
    }
    
    public static void Legnagyobbmotorteljesítmény(Autó[] kocsi)
    {
        for(int i=0; i<kocsi.length;i++)
        {
            for(int j=0;j<kocsi.length;j++)
            {
                if(kocsi[i].getMotorTeljesítmény()>kocsi[j].getMotorTeljesítmény())
                {
                    Autó tmp=kocsi[i];
                    kocsi[i]=kocsi[j];
                    kocsi[j]=tmp;
                    
                    
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Autó [] a = new Autó[]{
        new Autó("ACC-123", 70),
        new Autó("ABC-123", 50),
        new Autó("ADC-123", 30),
        new Autó("ABC-223", 110),
        new Autó("ABC-323", 40),
        new Teherautó(20, "RGB-230",80),
        new Teherautó(80, "RGB-530",60),
        new Teherautó(30, "RDB-930",70),
        new Teherautó(90, "RGB-130",90),
        new Teherautó(70, "RGB-830",70)};
        
        
        Teherautó[] t = new Teherautó[]{
        new Teherautó(20, "RGB-030",80),
        new Teherautó(80, "RGB-530",60),
        new Teherautó(30, "RDB-930",70),
        new Teherautó(60, "RGB-130",90),
        new Teherautó(70, "RGB-830",70),
        new Teherautó(20, "RGB-230",80),
        new Teherautó(110, "RGB-530",60),
        new Teherautó(130, "RDB-930",70),
        new Teherautó(90, "RGB-130",90),
        new Teherautó(70, "RGB-830",70)};
        
        rendezMaxSzállíthatóTeherCsökkenőleg(t);
        for(int i=0;i<t.length;i++)
             System.out.println("Max. szállítható teher: "+t[i]);
        
        
        Legnagyobbmotorteljesítmény(a);
            System.out.println("Maxmotor: "+a[1]);
        
       
    }
    
    
}
