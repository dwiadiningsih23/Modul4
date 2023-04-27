/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13020210021_dwi.adiningsih;

/**
 *
 * @author ASUS
 */
public class Adiningsih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Motor Motor = new Motor();
        Mobil Mobil = new Mobil();
 
        System.out.print("Merek Motor: ");
        Motor.tampilkanmerek();
        System.out.print("Warna Kendaraan: ");
        Motor.tampilkanwarna();
        
        System.out.print("Merek Mobil: ");
        Mobil.tampilkanmerek();     
        System.out.print("Warna Kendaraan: ");
        Mobil.tampilkanwarna();      
    
    
    }
    
}
