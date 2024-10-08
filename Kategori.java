/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Kategori extends KomponenPerusahaan {
    String namaKategori;
    String daftarProduk;
    
    public Kategori(String namaKategori, String daftarProduk){
        this.daftarProduk = daftarProduk;
        this.namaKategori = namaKategori;
    }
     public void tampilinfo(){
         System.out.println(" Kategori: " + namaKategori+ ", Daftar Produk: " + daftarProduk );
}
}
