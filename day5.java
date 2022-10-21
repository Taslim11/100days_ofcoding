
package day2;

import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner alling = new Scanner(System.in);
        String a;
        int b;
        System.out.print("Masukkan Nama : ");
        a = alling.nextLine();
        System.out.print("Masukkan Nilai : ");
        b = alling.nextInt();
        if(b > 70){
            System.out.println("Kamu hebat!");
        }else{
            System.out.println("Belajar lebih giat lagi");
        }
        
        
    }
}
