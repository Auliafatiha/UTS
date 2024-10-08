/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class SepedaMotor extends Kendaraan{
    @Override
    public void bergerak(){
         kecepatanMaksimal -= 10; 
        System.out.println("Sepeda Motor bergerak dengan kecepatan " + kecepatanMaksimal);
    }
}
