
package day2;

import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.println("## Piramida Bintang ##");
        System.out.println("====================================");

        int tinggi_segitiga,i,j,k;

        System.out.print("masukkan tinggi segitiga: ");
        tinggi_segitiga = sc.nextInt();

        System.out.println();

        for(i=1; i<=tinggi_segitiga; i++) {

          for(j=1; j<=tinggi_segitiga-i; j++) {
            System.out.print(" ");
          }

          for(k=1; k<=i; k++) {
            System.out.print(" *");
          }
          System.out.println();
        }
    }
}
