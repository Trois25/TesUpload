/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup.hewan;

/**
 *
 * @author USER
 */
public class Burung {
    //static: tidak perlu diinstansiasi
    //final: nilai konstanta

    public static final boolean bisaTerbang = true;
    public String nama = "";

    public Burung (String nama) {
        this.nama = nama;
        System.out.println("Nama burung: " + nama);
    }

    public void simpanNama(String nama) {  //method penyimpan nama
        this.nama = nama;
    }

    public void hapusNama() {              //method penghapus nama
        nama = "";
    }

    public String bacaNama() {             //method pengambil nama
        return nama;
    }

}
