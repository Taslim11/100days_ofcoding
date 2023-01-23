
package day2;

import java.util.Scanner;

public class day98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah penjualan hari ini: ");
        int jumlahPenjualan = sc.nextInt();
        int totalPenjualan = 0;
        for (int i = 1; i <= jumlahPenjualan; i++) {
            System.out.print("Masukkan harga barang ke-" + i + ": ");
            int hargaBarang = sc.nextInt();
            totalPenjualan += hargaBarang;
        }
        System.out.println("Total penjualan hari ini: Rp" + totalPenjualan);
    }
}
