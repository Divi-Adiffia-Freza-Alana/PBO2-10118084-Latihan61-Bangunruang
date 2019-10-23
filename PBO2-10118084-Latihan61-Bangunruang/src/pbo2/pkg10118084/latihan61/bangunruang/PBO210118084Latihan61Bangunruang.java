/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan61.bangunruang;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan program menghitung Volume BangunRuang
 */
public class PBO210118084Latihan61Bangunruang {
 private double r;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        bola.setJarijari(7);     
        System.out.println("volume bola :"+bola.hitungVolume()+"cm3");
        
        Tabung tabung = new Tabung();
        tabung.setJarijari(10);
        tabung.setTinggi(21);
        System.out.println("Volume Tabung :"+tabung.hitungVolume()+"cm3");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJarijari(14);
        kerucut.setTinggi(9);
        
        System.out.println("Volume kerucut :"+kerucut.hitungVolume()+"cm3");
        
        
    }
    
}
