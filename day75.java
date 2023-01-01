
package day2;

import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = sc.nextInt();
        System.out.print("Masukkan tarif per jam: ");
        int tarifPerJam = sc.nextInt();
        System.out.print("Masukkan bonus awal tahun: ");
        int bonus = sc.nextInt();
        System.out.print("Masukkan pajak: ");
        int pajak = sc.nextInt();

        int gaji = jamKerja * tarifPerJam + bonus;
        int gajiSetelahPajak = gaji - (gaji * pajak);
        System.out.println("Gaji buruh tani setelah dikurangi pajak adalah Rp" + gajiSetelahPajak);
  }
}
