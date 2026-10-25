package Method;
import java.util.Scanner;
public class Alat_Hitung {
  // ===== MODUL INPUT =====
    static int bacaIntPositif(Scanner input, String pesan) {
        int nilai;
        do {
            System.out.print(pesan);
            nilai = input.nextInt();
            if (nilai <= 0) {
                System.out.println("Masukan harus lebih dari 0.");
            }
        } while (nilai <= 0);
        return nilai;
    }

    // ===== MODUL BILANGAN =====
    static long faktorial(int n) {
        if (n <= 1) return 1;
        return n * faktorial(n - 1);
    }

    static boolean isPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ===== MODUL KEUANGAN (contoh overloading) =====
    static double hitungDiskon(double total) {
        return hitungDiskon(total, 10);
    }

    static double hitungDiskon(double total, double persen) {
        return total * persen / 100;
    }

    // ===== MODUL TAMPILAN =====
    static void tampilkanMenu() {
        System.out.println("=== PUSAT ALAT HITUNG ===");
        System.out.println("1. Faktorial");
        System.out.println("2. Cek bilangan prima");
        System.out.println("3. Hitung diskon");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    int n = bacaIntPositif(input, "Masukkan n: ");
                    System.out.println(n + "! = " + faktorial(n));
                    break;
                case 2:
                    int angka = bacaIntPositif(input, "Masukkan angka: ");
                    System.out.println(angka + (isPrima(angka) ? " adalah prima" : " bukan prima"));
                    break;
                case 3:
                    int total = bacaIntPositif(input, "Total belanja: ");
                    System.out.println("Diskon 10 persen: " + hitungDiskon(total));
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
            System.out.println();
        } while (pilihan != 0);

        input.close();
    }
}
   

