package Testing;

import java.util.Scanner;

/**
 * Program sederhana untuk menghitung luas persegi panjang.
 */
public class Main {
    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();

        // Meminta pengguna memasukkan lebar
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();

        // Menutup objek Scanner karena sudah tidak digunakan
        scanner.close();

        // Menghitung luas persegi panjang
        double luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas persegi panjang: " + luas);
    }
}
