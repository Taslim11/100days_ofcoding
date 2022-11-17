
package day2;

import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahBayar, discount, totalBayar, jarakTempuh, tarif;
        
        tarif = 10000;
        System.out.print("Masukkan jarak tempuh : ");
        jarakTempuh = sc.nextInt();
        System.out.println("jarak tempuh : "+ jarakTempuh + " km");
        
        if(jarakTempuh >= 10){
            jumlahBayar = tarif * jarakTempuh;
            discount =  jumlahBayar * 50 / 100;
            totalBayar =  jumlahBayar  - discount;
            System.out.println("Jumlah bayar : "+ jumlahBayar);
            System.out.println("discount : "+ discount);
            System.out.println("total bayar : "+ totalBayar);
        }else{
            jumlahBayar = tarif * jarakTempuh;
            System.out.println("Jumlah bayar : "+ jumlahBayar);
            System.out.println("discount : tidak ada discount");
            System.out.println("total bayar : "+ jumlahBayar);
        }
    }
}
