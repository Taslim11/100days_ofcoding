
package day2;

import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi belah ketupat : ");
        int sisi = sc.nextInt();
        System.out.println("Jadi keliling belah ketupat adalah : "+ 4*sisi);
    }
}
