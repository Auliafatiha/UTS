/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Reaksi_kendaraan {
    public static void main(String[] args){
        Kendaraan k = new Kendaraan();
        SepedaMotor sm = new SepedaMotor();
        Mobil m = new Mobil();
        Truk t = new Truk(300);
        
        k.bergerak();
        sm.bergerak();
        m.bergerak();
        t.bergerak();
        
        
    }
}
