package com.mycompany.Array;
import java.util.Scanner;
public class Mencari_Posisi_Data {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nilai = {80, 75, 90, 85, 70};

int cari = 90;
int posisi= -1;
boolean ditemukan = false;

for (int i = 0; i < nilai.length; i++) {
    if (nilai[i] == cari) {
        posisi = i;
        break;
    }
}

if (posisi != -1) {
    System.out.println("Data ditemukan pada indeks" + posisi);
} else {
    System.out.println(" Data tidak ditemukan ");
        
        }
    }
}