
package day2;

import java.util.Scanner;

public class day67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int lebar = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int tinggi = sc.nextInt();

        int luas = 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
        System.out.println("Luas balok adalah " + luas);
  }
}

