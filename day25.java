
package day2;

import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hasil = " ";
        int angka;
        System.out.print("Masukkan berapa tinggi segitiga : ");
        angka = sc.nextInt();
        for (int i = 0; i <= angka ; i++) {
            for (int j = 1; j <= i; j++) {
                hasil += "*";
            }hasil += "\n";
            
        }System.out.println(hasil);
        
    }
    
}
