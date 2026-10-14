package com.mycompany.Praktikum_2;

public class Segitiga_Rata_Kanan {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // Mencetak spasi
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }   
}
    

