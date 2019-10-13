/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Másfélmillió;



/**
 *
 * @author pappg
 */
public class Turazo  implements Comparable<Turazo> {
    String nev;
    int kek;
    int helyi;

    public Turazo(String nev, String utvonal) {
        this.nev = nev;
        char[] ut = utvonal.toCharArray();
        this.kek = 0;
        this.helyi = 0;
        for (int i = 0; i < ut.length; i++) {
            switch (ut[i]) {
                case 'K':
                    this.kek++;
                    break;
                case 'P':
                case 'S':
                case 'Z':
                    this.helyi++;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return nev;
    }

    @Override
    public int compareTo(Turazo t) {
        int kulonbseg = t.kek - this.kek;
        if (kulonbseg != 0) {
            return kulonbseg;
        }
        kulonbseg = t.helyi - this.helyi;
        if (kulonbseg != 0) {
            return kulonbseg;
        }
        return this.nev.compareTo(t.nev);
    }

}

