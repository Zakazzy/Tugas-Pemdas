package com.mycompany.ModulPraktikumArray;
public class TransposeMatriks {
    public static void main(String[] args){
    
    int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    
      System.out.println("--- Matriks Asli ---");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
         System.out.println("\n--- Hasil Transpose Matriks ---");
        for (int i = 0; i < matriks[0].length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                System.out.print(matriks[j][i] + " ");
             }
            System.out.println();
        }
    }
}