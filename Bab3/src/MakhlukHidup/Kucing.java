/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakhlukHidup;

/**
 *
 * @author USER
 */
public class Kucing extends Hewan implements Mamalia, Omnivora{
    private int umur;

    public Kucing() {
        System.out.println("Ini class kucing");
    }
    
    private void pup(){
        System.out.println("Hewan ini sedang pup");
    }
    
    @Override
    public void suara(){
        System.out.println("meong");
    }

    public int getUmur() {
        return umur;
    }
    
    public void getPup() {
        pup();
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public void kawin() {
        System.out.println("lagi kawin");
    }

    @Override
    public void berjalan() {
        System.out.println("kucing ini berjalan");
    }

    @Override
    public void melahirkan() {
        System.out.println("kucing melahirkan kan?");
    }

    @Override
    public void makanan() {
        System.out.println("kucing juga makan sayur");
    }
    
    
}
