
package day2;

import java.util.Scanner;

public class day92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perjalanan per hari: ");
        int jumlahPerjalanan = sc.nextInt();

        System.out.print("Masukkan setoran perjalanan (Rp): ");
        int setoran = sc.nextInt();

        int totalPerjalanan = 0;
        for (int i = 1; i <= jumlahPerjalanan; i++) {
          System.out.print("Masukkan jarak perjalanan ke-" + i + " (km): ");
          int jarak = sc.nextInt();

          int harga = jarak * 5000 + setoran;
          totalPerjalanan += harga;
        }

        System.out.println("Total pendapatan per hari: Rp" + totalPerjalanan);
    }
}
