
package day2;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("KALKULATOR");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("pilih menu :");
        int menu = sc.nextInt();  
            if(menu == 1){
                System.out.println("masukan angka pertama :");
                    int angka1 = sc.nextInt();
                    System.out.println("masukan angka kedua :");
                    int angka2 = sc.nextInt();
                    System.out.println("Hasilnya :");
                    System.out.println(angka1+angka2);
            }
            else if(menu == 2){
                System.out.println("masukan angka pertama :");
                    int angka1 = sc.nextInt();
                    System.out.println("masukan angka kedua :");
                    int angka2 = sc.nextInt();
                    System.out.println("Hasilnya :");
                    System.out.println(angka1-angka2);
            }
            else if(menu == 3){
                System.out.println("masukan angka pertama :");
                    int angka1 = sc.nextInt();
                    System.out.println("masukan angka kedua :");
                    int angka2 = sc.nextInt();
                    System.out.println("Hasilnya :");
                    System.out.println(angka1*angka2);
            }
            else if(menu == 4){
                System.out.println("masukan angka pertama :");
                    int angka1 = sc.nextInt();
                    System.out.println("masukan angka kedua :");
                    int angka2 = sc.nextInt();
                    System.out.println("Hasilnya :");
                    System.out.println(angka1/angka2);
            }
    }
  
}
