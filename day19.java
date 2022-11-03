
package day2;

import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int panjangTanah, lebarTanah, luas, hasil;   
    
        System.out.print("Masukkan panjang tanah : ");
        panjangTanah = sc.nextInt();
        System.out.print("Masukkan lebar tanah : ");
        lebarTanah = sc.nextInt();
        luas = panjangTanah * lebarTanah;
        hasil = luas * 300000;
      
            System.out.format("Jadi tanah yang kamu beli seharga %d dengan luas %d m %n", hasil, luas );
       
        

    }
}
