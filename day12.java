
package day2;

import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, luas;
        
        System.out.print("Masukkan Panjang Tanah :");
        panjang = sc.nextInt();
        System.out.print("Masukkan Lebar Tanah :");
        lebar = sc.nextInt();
        luas = panjang * lebar ;
        
        System.out.println("Panjang Tanah : " + panjang + " m");
        System.out.println("Lebar Tanah : " + lebar + " m");
        System.out.println("Luas Tanah : "+ luas + " m");
        
        if(luas > 200){
            System.out.println("Tanah Sangat Luas");
        }else{
            System.out.println("Tanah Cukup Luas");
        }
        
    }
}
