
package day2;

import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sisi1, sisi2, tinggi, luas;

        System.out.print("Masukkan panjang sisi1: ");
        sisi1 = sc.nextDouble();
        System.out.print("Masukkan panjang sisi2: ");
        sisi2 = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = sc.nextDouble();

        luas = (sisi1 + sisi2) * tinggi / 2;
        System.out.println("Luas trapesium: " + luas);
  }
}

