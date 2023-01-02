package day2;

import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = sc.nextInt();
        System.out.print("Masukkan tarif per jam: ");
        int tarifPerJam = sc.nextInt();
        System.out.print("Apakah Anda mendapatkan bonus besar-besaran? (Y/T)");
        String jawaban = sc.next();

        int gaji = jamKerja * tarifPerJam;
        if (jawaban.equalsIgnoreCase("Y")) {
          gaji += 500000;
        }
        System.out.println("Gaji buruh tali adalah Rp" + gaji);
  }
}
