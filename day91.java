
package day2;

import java.util.Scanner;

public class day91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka a : ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka b : ");
        int b = sc.nextInt();
        
        if (a>b){
            int angka = a;
            a=b;
            b=angka;
        }
        
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
