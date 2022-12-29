
package day2;

import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========Menghitung Gaji Tukang Batu===========");
        System.out.print("Masukkan jumlah hari kerja: ");
        int jumlahHari = input.nextInt();
        System.out.print("Masukkan tarif per hari: ");
        int tarifPerHari = input.nextInt();
        int gaji = jumlahHari * tarifPerHari;
        System.out.println("Gaji: " + gaji);
  }
}
