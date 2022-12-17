
package day2;

import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan gaji perjam: ");
    int gaji = sc.nextInt();
    System.out.print("Masukkan jumlah jam kerja: ");
    int jam = sc.nextInt();
    int totalGaji = gaji * jam;

        System.out.println("total gaji :" + totalGaji);
  }
}

