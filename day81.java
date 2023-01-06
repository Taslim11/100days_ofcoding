
package day2;

import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = sc.nextInt();

        String[][] daftarKaryawan = new String[jumlahKaryawan][3];

        for (int i = 0; i < jumlahKaryawan; i++) {
          System.out.println("Masukkan nama karyawan: ");
          daftarKaryawan[i][0] = sc.next();
          System.out.println("Masukkan gaji karyawan: ");
          daftarKaryawan[i][1] = sc.next();
          System.out.println("Masukkan jabatan karyawan: ");
          daftarKaryawan[i][2] = sc.next();
        }

        System.out.println("Daftar karyawan, gaji, dan jabatannya:");
        for (int i = 0; i < jumlahKaryawan; i++) {
          System.out.println(daftarKaryawan[i][0] + ": " + daftarKaryawan[i][1] + ", " + daftarKaryawan[i][2]);
        }
  }
}
