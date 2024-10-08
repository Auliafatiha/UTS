/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Gudang extends KomponenPerusahaan {
    String lokasiGudang;
    String daftarProduk;
    
    public Gudang(String lokasiGudang, String daftarProduk){
        this.lokasiGudang = lokasiGudang;
        this.daftarProduk = daftarProduk;
    }
     public void tampilinfo(){
         System.out.println("Lokasi Gudang" + lokasiGudang + " Daftar Produk " + daftarProduk );
     }     
}
