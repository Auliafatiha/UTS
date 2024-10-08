/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Produk extends KomponenPerusahaan  {
    String namaProduk;
    int harga;
    int stok;
    
    public Produk(String namaProduk, int harga, int stok){
    this.namaProduk = namaProduk;
    this.harga = harga;
    this.stok = stok;

    }
     public void tampilinfo(){
         System.out.println("Nama Produk" + namaProduk + " Harga Produk " + harga + "Stok Produk sebanyak "+ stok );
        
}
            
}   
    

