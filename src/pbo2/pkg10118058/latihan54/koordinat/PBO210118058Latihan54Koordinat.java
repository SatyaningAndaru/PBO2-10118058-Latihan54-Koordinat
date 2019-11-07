/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan54.koordinat;

/**
 *
 * @author user
 *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
 */
public class PBO210118058Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat wk= new WarnaKoordinat(10,4,"");
        wk.setNamaWarna("Jingga");
        System.out.println("Warna Koordinat : " +wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " +wk.getX()+" y : " +wk.getY());
    }
    
}
