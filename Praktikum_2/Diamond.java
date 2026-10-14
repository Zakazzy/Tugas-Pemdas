package com.mycompany.Praktikum_2;

public class Diamond {
    public static void main(String[] args) { 

        
         // Bagian atas
        for (int i = 1; i <= 5; i++) {

            // Mencetak spasi
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bagian bawah
        for (int i = 5 - 1; i >= 1; i--) {

            // Mencetak spasi
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
            
        }
    }
}