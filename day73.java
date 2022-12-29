
package day2;

import java.util.Scanner;

public class day73 {

    public static void main(String[] args) {
        int jumlahPenumpang;
        double hargaTiketPerPenumpang, diskon, biayaSewa;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah penumpang: ");
        jumlahPenumpang = input.nextInt();
        System.out.print("Masukkan harga tiket per penumpang: ");
        hargaTiketPerPenumpang = input.nextDouble();
        System.out.print("Masukkan diskon: ");
        diskon = input.nextDouble();

        biayaSewa = jumlahPenumpang * hargaTiketPerPenumpang;
        biayaSewa -= diskon;

        System.out.println("Biaya sewa: " + biayaSewa);
  }
}
