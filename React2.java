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
public class React2 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan pilihan pembayaran: "); 
   int pilihan = sc.nextInt();
   if(pilihan == 1){
    KartuKredit2 k = new KartuKredit2();
    k.validasiPembayaran();
   }
   else if(pilihan == 2){
    DompetDigital2 d = new DompetDigital2();
    d.validasiPembayaran();
    
   }else if(pilihan ==3){
    TransferBank2 b = new TransferBank2();
        b.validasiPembayaran();
   }
        
    }
}
