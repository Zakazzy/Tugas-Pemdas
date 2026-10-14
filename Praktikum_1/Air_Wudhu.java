package com.mycompany.Praktikum_1;
import java.util.Scanner;
public class Air_Wudhu {
 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Frekuensi wudhu : ");
        int frekuensiWudhu = input.nextInt();
        System.out.print("Air per wudhu (liter) : ");
        double airPerWudhu = input.nextDouble();
        double totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        double penghematan = totalAir * 15 / 100;
        double totalAirSetelahHemat = totalAir - penghematan;
        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air sebelum penghematan = "
                + totalAir + " liter");
        System.out.println("Air yang dihemat = "
                + penghematan + " liter");
        System.out.println("Total kebutuhan air setelah penghematan 15% = "
                + totalAirSetelahHemat + " liter");
        input.close();
        
    }
}
    

