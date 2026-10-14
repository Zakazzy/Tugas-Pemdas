package com.mycompany.Cpmk_2;
import java.util.Scanner;
public class Zakat_nisab {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan total harta: Rp");
       double harta = input.nextDouble();
               
       System.out.print("Masukkan Nilai nisab: Rp");
       double nisab = input.nextDouble();
       
       if (harta >= nisab) {
           double zakat = harta * 0.025;
           System.out.print("Zakat yang harus dibayarkan: Rp + zakat");
       } else {
           System.out.print("Harta belum mencapai nisab");
       }
       
       input.close();
       }
    }

