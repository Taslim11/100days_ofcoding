
package day2;

import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan umur anda :");
        int nilai = sc.nextInt();
         if(nilai < 5){
             System.out.println("usia balita");
         }
         else if(nilai >= 5 && nilai <= 15){
            System.out.println("usia anak-anak");
         }
         else if(nilai >= 15 && nilai <= 20){
             System.out.println("usia remaja");
         }
         else if(nilai >= 20 && nilai <= 50){
             System.out.println("usia dewasa");
         }
         else if(nilai >= 50 && nilai <= 60 ){
             System.out.println("usia tua");
         }
         else{
             System.out.println("usia lanjut usia");
         }
    }
}
