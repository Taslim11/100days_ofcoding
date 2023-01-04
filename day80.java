
package day2;

import java.util.Scanner;

public class day80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = new String[2];
        String[] nim = new String[2];
        String[] kelas = new String[2];
        String[] nilai = new String[2];

        for (int i = 0; i < 2; i++) {
          System.out.print("Masukkan Nama mahasiswa: ");
          nama[i] = sc.nextLine();
          System.out.print("Masukkan NIM mahasiswa: ");
          nim[i] = sc.nextLine();
          System.out.print("Masukkan Kelas mahasiswa: ");
          kelas[i] = sc.nextLine();
          System.out.print("Masukkan Nilai Matkul PBO : ");
          nilai[i] = sc.nextLine();
        }
        System.out.println("==============================");
        System.out.println("Daftar Nama dan NIM mahasiswa:");
        for (int i = 0; i < 2; i++) {
          System.out.println(nama[i] + " (" + nim[i] + ")" + kelas[i] + "(Nilai PBO : " + nilai[i] + ")");
        }
    }
}
