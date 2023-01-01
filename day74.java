
package day2;

import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = sc.nextInt();
        System.out.print("Masukkan tarif per jam: ");
        int tarifPerJam = sc.nextInt();
        System.out.print("Masukkan bonus akhir tahun: ");
        int bonus = sc.nextInt();

        int gaji = jamKerja * tarifPerJam + bonus;
        System.out.println("Gaji buruh tani adalah Rp" + gaji);
  }
}
