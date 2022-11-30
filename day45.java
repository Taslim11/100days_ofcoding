
package day2;

import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Pesanan : ");
        int jumlahPesanan = sc.nextInt();
        int harga = 15000;
        if (jumlahPesanan >= 50) {
            int jumlahBayar = harga * jumlahPesanan;
            int discount = 2000;
            int totalBayar = jumlahBayar - discount;
            System.out.println("Jumlah Bayar : "+ jumlahBayar);
            System.out.println("discount : "+ discount);
            System.out.println("Total Bayar : "+ totalBayar);
        }
    }
}
