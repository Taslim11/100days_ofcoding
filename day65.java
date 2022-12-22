
package day2;

import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int gajiPokok;
    int jumlahAnak;
    int gajiTotal;
        System.out.println("==== Menghitung gaji pemerintah ====");
        System.out.println();
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlahAnak = sc.nextInt();
        gajiTotal = gajiPokok;
        if (jumlahAnak > 0) {
          gajiTotal += jumlahAnak * 100000; 
        }
        System.out.println("====================================");
        System.out.println();
        System.out.println("gaji pokok : Rp"+ gajiPokok);
        System.out.println("jumlah anak : "+ jumlahAnak);
        System.out.println("tunjangan anak : Rp100000 per anak");
        System.out.println("Gaji total: Rp" + gajiTotal);
  }
}
