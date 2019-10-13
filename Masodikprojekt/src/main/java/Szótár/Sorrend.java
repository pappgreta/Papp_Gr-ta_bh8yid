/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Szótár;

/**
 *
 * @author pappg
 */
public class Sorrend {
    class Szotarsorrend implements Comparable<Szotarsorrend>
{
private final String angol;
private final String magyar;

    public Szotarsorrend(String angol, String magyar)
    {
        this.angol = angol;
        this.magyar = magyar;
    }

    public String getAngol() {
        return angol;
    }

    public String getMagyar() {
        return magyar;
    }

    @Override
    public String toString() {
        return angol + ":" + magyar;
    }

    

    @Override
    public int compareTo(Szotarsorrend o)
    {
    int kulonbseg=angol.compareTo(o.angol);
    if(kulonbseg!=0)
        return kulonbseg;
    kulonbseg=magyar.compareTo(o.magyar);
    if(kulonbseg!=0)
        return kulonbseg;
    return 0;
    
    }
 }
}
