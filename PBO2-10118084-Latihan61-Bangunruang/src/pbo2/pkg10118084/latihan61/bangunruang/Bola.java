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
public class Bola implements BangunRuang {
    private int jarijari;

    
    public int getJarijari() {
        return jarijari;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    

    @Override
    public double hitungVolume() {
       return 4*Math.PI*jarijari*jarijari*jarijari/3; 
    }
    
}
