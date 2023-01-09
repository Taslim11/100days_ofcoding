
package day2;

import java.util.Scanner;

public class day85 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi sejajar 1: ");
        double sisi1 = sc.nextDouble();
        System.out.print("Masukkan sisi sejajar 2: ");
        double sisi2 = sc.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();
        System.out.print("Masukkan sisi miring 1: ");
        double sisiMiring1 = sc.nextDouble();
        System.out.print("Masukkan sisi miring 2: ");
        double sisiMiring2 = sc.nextDouble();

        double luas = ((sisi1 + sisi2) * tinggi) / 2;

        double keliling = sisi1 + sisi2 + sisiMiring1 + sisiMiring2;

        System.out.println("Luas trapesium: " + luas + " meter persegi");
        System.out.println("Keliling trapesium: " + keliling + " meter");
    }
}
