
package day2;

import java.util.Scanner;

public class day66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamKerja, gajiPerJam;
        int gajiTotal;
        
        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = sc.nextInt();
        System.out.print("Masukkan gaji per jam: ");
        gajiPerJam = sc.nextInt();

        gajiTotal = jamKerja * gajiPerJam;

        System.out.println("=================================");
        System.out.println("Jumlah Jam Kerja : "+ jamKerja + " Jam");
        System.out.println("Jumlah Gaji Per Jam : Rp"+ gajiPerJam);
        System.out.println("Gaji total: Rp" + gajiTotal);
  }
}
