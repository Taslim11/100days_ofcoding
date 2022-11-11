
package day2;

import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        char ulang;
        do {
            System.out.println("## Daftar Menu Kedai Samusenga'na ##");
            System.out.println("====================================");
            System.out.println("1. Pangsit");
            System.out.println("2. Mie Bakso");
            System.out.println("3. Nasi Goreng");
            System.out.println("4. Nasi Kuning");
            System.out.println();
            
            System.out.print("Pilihan anda : ");
            pilihan = sc.nextInt();
            
            switch(pilihan){
                case 1:
                    System.out.println("Anda memilih Pangsit");
                    break;
                case 2:
                    System.out.println("Anda memilih Mie Bakso");
                    break;
                case 3:
                    System.out.println("Anda memilih Nasi Goreng");
                    break;
                case 4:
                    System.out.println("Anda memilih Nasi Kuning");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
            
            
            System.out.print("Ingin memilih menu yang lain (y/t)? ");
            ulang = sc.next().charAt(0);
            
            
        } while (ulang != 't');
        System.out.println("Terima Kasih...");
    }
}
