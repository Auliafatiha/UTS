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
public class KartuKredit implements Pembayaran{
    Scanner sc = new Scanner(System.in);
    
//    system.out.print("Masukkan nomor kartu");
   
    @Override
    public void validasiPembayaran() {
        System.out.print("Masukkan nomor kartu");
        int nomorkartu = sc.nextInt();
        if ( nomorkartu >= 0){
          System.out.print("Pembayaran Berhasil");  
        }else{
            return;
        }
        
    }
    
}
