
package day2;

import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nama = new String[5];
        String[] nim = new String[5];

        for (int i = 0; i < 5; i++) {
          System.out.print("Masukkan nama mahasiswa: ");
          nama[i] = sc.nextLine();
          System.out.print("Masukkan NIM mahasiswa: ");
          nim[i] = sc.nextLine();
        }
        System.out.println("==============================");
        System.out.println("Daftar nama dan NIM mahasiswa:");
        for (int i = 0; i < 5; i++) {
          System.out.println(nama[i] + " (" + nim[i] + ")");
        }
  }
}
