package Latihan_Array;
import java.util.Scanner;
public class NilaiMahasiswa {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] nilai = new double[3][4];
    
    for (int i = 0; i < 3; i++) {
        System.out.println("\nMahasiswa ke-" + (i + 1));
    
    for (int j = 0; j< 4; j++){
        System.out.println("Nilai mata kuliah ke-"
            + (j + 1) + ": ");
        nilai[i][j] = input.nextDouble();
        }
    }
        
    System.out.println("\n=== HASILNYA INI BOSS ===");
    
    for (int i = 0; i < 3; i++){
        double total = 0;
        
    for (int j = 0; j < 4; j++) {
        total += nilai[i][j];
    }
    double rataRata = total / 4;
    
    System.out.println("Rata-Rata mahasiswa ke-"
        + (i + 1) + ":" + rataRata);
    }
    input.close();
    
    }
}