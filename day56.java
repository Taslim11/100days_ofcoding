
package day2;

import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner kaco = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan angka pertama : ");
        a = kaco.nextInt();
        System.out.print("Masukkan angka kedua : ");
        b = kaco.nextInt();
        
        System.out.println("Hasil pembagian di atas adalah : " + a/b );
    }
}
