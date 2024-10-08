/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Mobil extends Kendaraan {
   @Override
   public void bergerak(){
      kecepatanMaksimal += 20;
      System.out.println("Mobil bergerak dengan kecepatan " + kecepatanMaksimal);
   } 
}
