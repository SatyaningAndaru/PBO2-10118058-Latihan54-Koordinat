/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan54.koordinat;

/**
 *
 * @author user
 */
public class WarnaKoordinat extends Koordinat {
private String namaWarna;
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
    
}
