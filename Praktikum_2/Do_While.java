package com.mycompany.Praktikum_2;
import java.util.Scanner;
public class Do_While {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int angka;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti):");
            angka = input.nextInt();
            System.out.println("Anda masukkan:" + angka);
        } while (angka != 0);   
        System.out.print("Program selesai");
    }
}
