
package day2;

import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaBinte = 10000;
        int discount = 5000;
        int jumlahPesanan, totalBayar;
        
        System.out.print("Masukkan jumlah pesanan :");
        jumlahPesanan = sc.nextInt();
        
        if(jumlahPesanan >= 10){
            totalBayar = hargaBinte * jumlahPesanan - discount;
            System.out.println("total bayar : "+ totalBayar);
        }
        if(jumlahPesanan < 10){
            totalBayar = hargaBinte * jumlahPesanan;
            System.out.println("total bayar : "+ totalBayar);
            
        }
        
    }
}
