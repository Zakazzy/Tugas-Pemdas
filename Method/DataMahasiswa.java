package Method;
import java.util.Scanner;
public class DataMahasiswa {

    static Scanner input = new Scanner(System.in);
    static int inputUkuran(String pesan) {
        int ukuran;
        do {
        System.out.print(pesan);
        ukuran = input.nextInt();
        if (ukuran <= 0) {
        System.out.println("Senggenah Mas!,Mosok yo 0");
        }
        
        } while (ukuran <= 0);
        input.nextLine();
        return ukuran;
    }
    static void inputData(String[][][] mahasiswa, String[] prodi) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("\nProdi: " + prodi[i]);
            for (int j = 0; j < mahasiswa[i].length; j++) {
            for (int k = 0; k < mahasiswa[i][j].length; k++) {
            System.out.print("Kelas " + (j + 1)
            + ", mahasiswa ke-" + (k + 1) + ": ");
                    mahasiswa[i][j][k] = input.nextLine();
                }
            }
        }
    }
    static void tampilData(String[][][] mahasiswa, String[] prodi) {
        System.out.println("\n=================================");
        System.out.println("     HASIL REKAPITULASI DATA     ");
        System.out.println("=================================");
        for (int i = 0; i < mahasiswa.length; i++) {
        System.out.println("\nProdi: " + prodi[i]);
        for (int j = 0; j < mahasiswa[i].length; j++) {
        System.out.println("Kelas " + (j + 1) + ":");
        for (int k = 0; k < mahasiswa[i][j].length; k++) {
            String nama = mahasiswa[i][j][k];

        System.out.println((k + 1) + ". " + nama);
        System.out.println("   Jumlah karakter: "
        + nama.length());
                }
            }
        }
        System.out.println("\n=================================");
        System.out.println("Total program studi: " + prodi.length);
        System.out.println("Total kelas: "
            + (mahasiswa.length * mahasiswa[0].length));

        int totalMahasiswa = 0;
        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                totalMahasiswa += mahasiswa[i][j].length;
            }
        }
        System.out.println("Total mahasiswa: " + totalMahasiswa);
        System.out.println("=================================");
    }
    public static void main(String[] args) {
        System.out.println("=== 0_0 PENDATAAN MAHASISWA -_- ===");
        int jumlahProdi = inputUkuran("Jumlah prodi: ");
        int jumlahKelas = inputUkuran("Jumlah kelas per prodi: ");
        int jumlahMahasiswa = inputUkuran(
            "Jumlah mahasiswa per kelas: ");
        String[][][] mahasiswa =
            new String[jumlahProdi][jumlahKelas][jumlahMahasiswa];
        String[] prodi = new String[jumlahProdi];
        for (int i = 0; i < jumlahProdi; i++) {
            System.out.print("Nama prodi ke-" + (i + 1) + ": ");
            prodi[i] = input.nextLine();
        }
        inputData(mahasiswa, prodi);
        tampilData(mahasiswa, prodi);

        input.close();
    }
}