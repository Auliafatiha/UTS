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
public class DompetDigital2 extends Transaksi  {
Scanner sc = new Scanner(System.in);
    @Override
    void validasiPembayaran() {
      
            System.out.print("Masukkan nomor transaksi: ");
            nomorTransaksi = sc.nextInt();
             System.out.print("Masukkan saldo: ");
            int saldo = sc.nextInt();
            System.out.print("Masukkan nominaltransaksi: ");
            nominalTransaksi = sc.nextInt();
            if (saldo >= nominalTransaksi){
                 System.out.print("pembayaran Transaksi nomor" + nomorTransaksi + " berhasil");
            }else if(saldo <= nominalTransaksi){
                System.out.print("pembayaran Transaksi nomor" + nomorTransaksi + " gagal saldo tidak mencukupi");
            }else{
                return;
            }
    }
    
}
