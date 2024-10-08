/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    
    public Truk (int kapasitasMuatan){
        this.kapasitasMuatan = kapasitasMuatan;
    }
    
    public void setkapasitasMuatan(int kapasitasMuatan){
        this.kapasitasMuatan = kapasitasMuatan;
    }
    int getkapasitasMuatan(){
        return kapasitasMuatan;
    }
    
    @Override
    public void bergerak(){
         kecepatanMaksimal += 40;
        
        System.out.println("Truk memuat muatan sebesar: " + kapasitasMuatan);
        System.out.print("Truk bergerak dengan kecepatan: " + kecepatanMaksimal);
    }
    
}
