package com.mycompany.Cpmk_2;
import java.util.Random;
import java.util.Scanner;
public class Tebak_Angka {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int angkaRahasia = random.nextInt(100) + 1;
        int maksimalPercobaan = 7;
        boolean benar = false;
        
        System.out.println("=== PERMAINAN TEBAK ANGKA ===");
        System.out.println("Tebak angka dari 1 sampai 100.");
        System.out.println("Anda memiliki 7 kali percobaan.");
        
        for (int percobaan = 1; percobaan <= maksimalPercobaan; percobaan++) {
            System.out.println("Percobaan ke-" + percobaan + ": ");
            int tebakan = input.nextInt();
            
            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!");                
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!");
            } else {
                System.out.println("Benar!");
                System.out.println("Anda berhasil dalam "
                        + percobaan + " percobaan.");
                benar = true;
                break;
            }
         }          
        if (!benar) {
            System.out.println("Kesempatan habis!");
            System.out.println("Angka yang benar adalah " + angkaRahasia);
        }        
        input.close();
    }
    
}