package com.mycompany.Praktikum_2;
import java.util.Scanner;
public class Perkalian {
    
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukkan angka perkalian");
    int angka = input.nextInt();
    
    for (int i = 1; i <= 10; i++) {
        int hasil = angka * i;
        System.out.println(angka + "x" + i + "=" + hasil);
        
            }
        }
    }