
package day2;

import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("##  Piramida Bintang Terbalik  ##");
        System.out.println("==============================================");

        int tinggi_segitiga;

        System.out.print("Input tinggi segitiga: ");
        tinggi_segitiga = sc.nextInt();

        System.out.println();

        for(int i=0; i<=tinggi_segitiga; i++) {

          for(int j=1; j<=i; j++) {
            System.out.print(" ");
          }

          for(int k=1; k<=tinggi_segitiga-i; k++) {
            System.out.print(" *");
          }
          System.out.println();
          
        }
          
    }
    
}
