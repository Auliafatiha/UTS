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
public class TransferBank implements Pembayaran {
Scanner sc = new Scanner(System.in);
    @Override
    public void validasiPembayaran() {
        System.out.println("Masukkan Nomor Rekening: "); 
        int norek = sc.nextInt();
        if (norek >= 0){
            System.out.println("pembayaran berhasil");
        }
    }
    
}
