
package day2;

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPangsit = 15000;
        int discount1 = 2000;
        int discount2 = 5000;
        int jumlahPesanan, totalBayar;
        
        System.out.print("Masukkan jumlah pesanan :");
        jumlahPesanan = sc.nextInt();
        
        if(jumlahPesanan >= 20 ){
            System.out.println("harga pangsit : "+ hargaPangsit);
            System.out.println("discount "+ discount2);
            totalBayar = hargaPangsit * jumlahPesanan - discount2;
            System.out.println("total bayar : "+ totalBayar);
        }
        else if(jumlahPesanan  >= 15){
            System.out.println("harga pangsit : "+ hargaPangsit);
            System.out.println("discount "+ discount1);
            totalBayar = hargaPangsit * jumlahPesanan - discount1;
            System.out.println("total bayar : "+ totalBayar);
        }
        else{
            totalBayar = hargaPangsit * jumlahPesanan;
            System.out.println("total bayar : "+ totalBayar);
        }
    }
}
