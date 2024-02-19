/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab2;

import makhlukhidup.hewan.*;

public class Main {

    public static void main(String[] args) {
        makhlukhidup.Manusia m = new makhlukhidup.Manusia();
        System.out.println("nama: " + m.nama);
        
        System.out.println("Semua burung pasti bisa terang? " + Burung.bisaTerbang);
        Burung b = new Burung("Beo");
        
        b.hapusNama();
        b.simpanNama("Kasuari");
        System.out.println("Nama baru burung: " + b.bacaNama());

    }
    
}
