
package day2;

import java.util.Scanner;

public class day57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

      System.out.print("Masukkan panjang alas limas: ");
      int a = sc.nextInt();

      System.out.print("Masukkan lebar alas limas: ");
      int b = sc.nextInt();

      int keliling = 2 * (a + b);

      System.out.println("Keliling limas adalah: " + keliling);
    }
}
