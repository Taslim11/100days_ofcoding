
package day2;

import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan, jumlahBarang, bonus, hargaBarang, totalBayar, discount, jumlahBayar ;
        char ulang;
        do {
            System.out.println("=======================================");
            System.out.println("## Selamat datang di toko Kopi Sisalili ##");
            System.out.println("====#Daftar Kopi#====");
            System.out.println("1. Kopi TOP");
            System.out.println("2. Kopi Kapal Api");
            System.out.println("3. Kopi Asli");
            System.out.println("======================================");
            
            System.out.print("Pilihan anda : ");
            pilihan = sc.nextInt();
            
            if (pilihan == 1){
                hargaBarang = 2000;
                System.out.println("Harga Kopi Top : "+ hargaBarang);
                System.out.println("beli 4 gratis 1 Sachet");
                System.out.println();
                System.out.print("Jumlah barang : ");
                jumlahBarang = sc.nextInt();
               
                if (jumlahBarang >= 4) {
                    bonus = jumlahBarang + 1;
                    totalBayar = hargaBarang * jumlahBarang;
                    System.out.println("Total Barang : "+ bonus);
                    System.out.println("Total Bayar : "+ totalBayar );
                }else{
                    totalBayar = hargaBarang * jumlahBarang;
                    System.out.println("Total Bayar : "+ totalBayar );
                }
                
            }if (pilihan == 2){
                hargaBarang = 5000;
                System.out.println("Harga Kopi Kapal Api : "+ hargaBarang);
                System.out.println("Discount 50% jika beli 10 Sachet atau lebih");
                System.out.println();
                System.out.print("Jumlah barang : ");
                jumlahBarang = sc.nextInt();
               
                if (jumlahBarang >= 10) {
                    jumlahBayar = hargaBarang * jumlahBarang;
                    discount =  jumlahBayar * 50/100 ;
                    totalBayar = jumlahBayar - discount;
                    System.out.println("Discount : "+ discount);
                    System.out.println("Total Bayar : "+ totalBayar );
                }else{
                    totalBayar = hargaBarang * jumlahBarang;
                    System.out.println("Total Bayar : "+ totalBayar );
                }
            }if (pilihan == 3){
                hargaBarang = 2000;
                System.out.println("Harga Kopi Asli : "+ hargaBarang);
                System.out.println();
                System.out.print("Jumlah barang : ");
                jumlahBarang = sc.nextInt();
                totalBayar = hargaBarang * jumlahBarang;
                System.out.println("Total Bayar : "+ totalBayar );
                
            }
            System.out.println();
            System.out.print("Ingin memilih menu yang lain (y/t)? ");
            ulang = sc.next().charAt(0);
        } while (ulang != 't');
            System.out.println("Terim Kasih.....");
    }
}

