
package day2;

import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah barang yang terjual: ");
        int jumlahBarang = sc.nextInt();
        System.out.print("Masukkan harga barang: ");
        int hargaBarang = sc.nextInt();
        int totalPenjualan = jumlahBarang * hargaBarang;

        System.out.println("Total penjualan adalah Rp" + totalPenjualan);
  }
}

