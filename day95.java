
package day2;

import java.util.Scanner;

public class day95 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih jenis kayu (balok/papan): ");
        String jenis = sc.next();
        System.out.print("Masukkan jumlah kayu yang dibeli (dalam meter): ");
        int jumlah = sc.nextInt();
        int harga = 0;
        if (jenis.equals("balok")) {
            harga = jumlah * 3000; // harga satuan kayu balok adalah Rp 3.000 per meter
        } else if (jenis.equals("papan")) {
            harga = jumlah * 2000; // harga satuan kayu papan adalah Rp 2.000 per meter
        } else {
            System.out.println("Jenis kayu tidak valid!");
        }
        if (harga > 0) {
            System.out.println("Harga yang harus dibayar: Rp " + harga);
        }
    }
}
