
package day2;

import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("Masukkan harga barang1 : ");
        a = sc.nextInt();
        System.out.print("Masukkan harga barang2 : ");
        b = sc.nextInt();
        System.out.print("Masukkan harga barang3 : ");
        c = sc.nextInt();
        System.out.print("Masukkan harga barang4 : ");
        d = sc.nextInt();
        
        System.out.println("Harga total barang : "+ (a+b+c+d));
        
    }
}
