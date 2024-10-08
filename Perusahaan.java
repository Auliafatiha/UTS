/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Perusahaan {
    public static void main(String[] args){
       
        
         Produk p = new Produk("Rexona",2000,10);
         Gudang g = new Gudang("Surabaya","Pelembab, Bedak, Lipstik");
         Kategori k = new Kategori("Kecantikan","Pelembab, Bedak, Lipstik");
         
         p.tampilinfo();
         g.tampilinfo();
         k.tampilinfo();
         
    }
  
}
