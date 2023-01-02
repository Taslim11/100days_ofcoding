
package day2;

import java.util.Scanner;

public class day77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama pegawai: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = scan.nextInt();
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = scan.nextInt();
        int gajiTotal = gajiPokok + (jamKerja * 5000); // 5000 adalah upah per jam

        System.out.println("Gaji total " + nama + " adalah: " + gajiTotal);
  }
}
