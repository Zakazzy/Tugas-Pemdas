package com.mycompany.Praktikum_2;
import java.util.Scanner;
public class Pola_Dinamis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tinggi;

        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {

            // Membuat spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Membuat bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
