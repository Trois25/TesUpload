/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakhlukHidup;


public abstract class Hewan {
    public int kaki;
    public String ras;
    
    public void makan(){
        System.out.println("hewan ini sedang makan");
    }
    
    public void suara(){
        
    }
    
    public abstract void kawin();
    public abstract void berjalan();

}
