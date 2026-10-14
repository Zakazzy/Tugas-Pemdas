package com.mycompany.Praktikum_2;
import java.util.Scanner;
public class Menu_Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menhitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\nAngka 1-10:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    System.out.println("\nBilangan genap 1-10:");
                    for (int i = 1; i <= 10; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 3:
                    int jumlah = 0;

                    for (int i = 1; i <= 10; i++) {
                        jumlah += i;
                    }

                    System.out.println("\nJumlah 1-10 = " + jumlah);
                    break;

                case 4:
                    System.out.println("\nSegitiga Bintang:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak tersedia!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
