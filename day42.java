
package day2;

import java.util.Scanner;

public class day42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Panjang Balok : ");
            int panjang = sc.nextInt();
            System.out.print("Masukkan lebar Balok : ");
            int lebar = sc.nextInt();
            System.out.print("Masukkan tinggi Balok : ");
            int tinggi = sc.nextInt();
            System.out.print("Jadi keliling balok adalah : "+ 4*(panjang + lebar + tinggi));
        }
        
    }
