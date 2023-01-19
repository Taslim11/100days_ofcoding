
package day2;

import java.util.Scanner;

public class day94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah ton tali yang dibeli: ");
        int ton = sc.nextInt();
        int harga = ton * 100000; 
        if (ton > 5) {
            harga = harga - (harga * 10/100); 
        }
        System.out.println("Harga yang harus dibayar: Rp " + harga);
    }
}

