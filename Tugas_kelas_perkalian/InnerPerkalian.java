/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Tugas_kelas_perkalian;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class InnerPerkalian {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt(); 
        System.out.println("Tabel perkalian untuk " + angka + ":");
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
        
        input.close();
    }
}
