/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        MakhlukHidup.Kucing Rama = new MakhlukHidup.Kucing();
        Rama.suara();
        
        Rama.kaki = 4;
        Rama.ras = "kampung";
        System.out.println("Ras : " + Rama.ras);
        Rama.makan();
        Rama.getPup();
        Rama.setUmur(22);
        System.out.println("umur : " + Rama.getUmur());
        Rama.kawin();
        Rama.makanan();
        
        System.out.println("");
        System.out.println("");
        
        MakhlukHidup.Ikan Fikri = new MakhlukHidup.Ikan();
        Fikri.suara();
        Fikri.kaki = 0;
        System.out.println("Kaki ikan : " + Fikri.kaki);
        
//        MakhlukHidup.Hewan[] binatang = {Rama,Fikri};
//        binatang[1].makan();
        Rama.berjalan();
        Fikri.berjalan();

    }
    
}
