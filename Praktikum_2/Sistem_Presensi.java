package com.mycompany.Praktikum_2;
import java.util.Scanner;
public class Sistem_Presensi {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Kehadiran mahasiswa ke-" + i + " (1=Hadir, 0=Tidak Hadir): ");
            int kehadiran = input.nextInt();

            if (kehadiran == 1) {
                jumlahHadir++;
            } else if (kehadiran == 0) {
                jumlahTidakHadir++;
            } else {
                System.out.println("Input tidak valid!");
            }
        }

        double persentase = (double) jumlahHadir / jumlahMahasiswa * 100;
        System.out.println("\n=== HASIL KEHADIRAN ===");
        System.out.println("Jumlah mahasiswa       : " + jumlahMahasiswa);
        System.out.println("Jumlah hadir           : " + jumlahHadir);
        System.out.println("Jumlah tidak hadir     : " + jumlahTidakHadir);
        System.out.println("Persentase kehadiran   : " + persentase + "%");

        if (persentase >= 75) {
            System.out.println("Status: Memenuhi syarat");
        } else {
            System.out.println("Status: Tidak memenuhi syarat");
    }
        
   }
}