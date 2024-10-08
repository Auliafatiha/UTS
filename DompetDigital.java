/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class DompetDigital implements Pembayaran {
Scanner sc = new Scanner(System.in);
    @Override
    public void validasiPembayaran() {
     System.out.println("Masukkan nominal transaksi: "); 
         int nominal = sc.nextInt();
     System.out.println("Masukkan nominal transaksi: "); 
         int saldo = sc.nextInt();
         
         if(saldo <= nominal){
             System.out.println("pembayaran tidak dapat dilakukan");
         } else if(saldo >= nominal){
             System.out.println("pembayaran berhasil");
         }
         
        
    }
    
}
