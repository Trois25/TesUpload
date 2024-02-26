/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakhlukHidup;

/**
 *
 * @author USER
 */
public class Ikan extends Hewan{

    public Ikan() {
        System.out.println("Ini class ikan");
    }
    
    @Override
    public void suara(){
        System.out.println("blubuk");
    }

    @Override
    public void kawin() {
        System.out.println("ikan kawin");
    }

    @Override
    public void berjalan() {
        System.out.println("ikan berenang woi");
    }
    
}
