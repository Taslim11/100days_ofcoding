
package day2;

import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        int alas = sc.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = sc.nextInt();

        int luasSegitiga = (alas * tinggi) / 2;
        System.out.println("Luas segitiga: " + luasSegitiga);
    }
}
