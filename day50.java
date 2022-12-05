
package day2;

import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan nilai N : ");
        angka = sc.nextInt();
        
        System.out.println("Bilangan ganjil yang tidak habis di bagi tiga");
        for (int i = 1; i <= angka; i++) {
            if(i % 3 == 1){
                System.out.println(i);
            }
        }
    }
}
