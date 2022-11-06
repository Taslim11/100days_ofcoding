
package day2;

import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka, jumlah ;
        jumlah = 0;
        System.out.print("Masukkan nila N : ");
        angka = sc.nextInt();
        System.out.println("==========================================");
        for (int i = 1; i <= angka; i++) {
            if(i % 3 == 0){
                if(i % 2 == 1){
                    jumlah = jumlah += i;
                   System.out.println(i); 
                }
                
            }
             
        }
        System.out.println("========================================");
        System.out.println(jumlah);
    }
}
