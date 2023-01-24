
package day2;

import java.util.Scanner;

public class day99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPenumpang, hargaTiketPerPenumpang, diskon, biayaSewa;
        
        System.out.print("Masukkan jumlah penumpang: ");
        jumlahPenumpang = sc.nextInt();
        System.out.print("Masukkan harga tiket per penumpang: ");
        hargaTiketPerPenumpang = sc.nextInt();
        System.out.print("Masukkan diskon: ");
        diskon = sc.nextInt();

        biayaSewa = jumlahPenumpang * hargaTiketPerPenumpang;
        biayaSewa -= diskon;

        System.out.println("Biaya sewa: " + biayaSewa);
    }
}
