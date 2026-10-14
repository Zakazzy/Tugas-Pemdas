package com.mycompany.Cpmk_2;
import java.util.Scanner;
public class Parkir {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jenis kendaraan (motor/mobil): ");
        String jenis = input.nextLine().toLowerCase();
        
        System.out.print("Masukkan lama parkir (jam): ");
        int lama = input.nextInt();
        int tarifAwal =5000;
        int tarifTambahan = 1000;
        
        if (jenis.equals("motor")) {
            tarifAwal = 2000;
            tarifTambahan = 1000;           
        } else if (jenis.equals("mobil")) {    
            tarifAwal = 5000;
            tarifTambahan = 2000;
        } else {
            System.out.println("Jenis kendaraan tidal valid. ");
            input.close();
            return;
        }    
        int total;        
        if (lama <= 1) {
            total = tarifAwal;
        } else {
            total = tarifAwal + (lama - 1) * tarifTambahan;
        }        
        System.out.println("Total biaya parkir: Rp " + total);        
        input.close();
    }
    
} 

