package com.mycompany.Praktikum_2;
import java.util.Scanner;
public class Nilai_Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int totalNilai = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();

            totalNilai = totalNilai + nilai;

        if (nilai >= 75) {
            System.out.println("Status: Lulus");
            jumlahLulus++;
        } else {
        System.out.println("Status: Tidak Lulus");
        jumlahTidakLulus++;
    }
}

double rataRata = (double) totalNilai / 5;
System.out.println("\n=== HASIL ===");
System.out.println("Jumlah mahasiswa lulus        : " + jumlahLulus);
System.out.println("Jumlah mahasiswa tidak lulus  : " + jumlahTidakLulus);
System.out.println("Rata-rata nilai               : " + rataRata);

    }
}
