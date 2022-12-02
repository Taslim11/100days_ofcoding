
package day2;

import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Input Nilai Anda (A - E): ");
          char nilai = sc.next().charAt(0);
     
            switch (nilai) {
              case 'A':
                System.out.println("Pertahankan!");
                break;
              case 'B':
                System.out.println("Harus lebih baik lagi");
                break;
              case 'C':
                System.out.println("Perbanyak belajar");
                break;
              case 'D':
                System.out.println("Jangan keseringan main");
                break;
              case 'E':
                System.out.println("Kebanyakan bolos...");
                break;
              default:
                System.out.println("Maaf, format nilai tidak sesuai");
                }
     
    }
}
