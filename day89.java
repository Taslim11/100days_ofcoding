
package day2;

import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        double luas = Math.PI * Math.pow(jariJari, 2);
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}
