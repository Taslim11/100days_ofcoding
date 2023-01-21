
package day2;

import java.util.Scanner;

public class day96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah ikan yang ditangkap: ");
        int jumlahIkan = sc.nextInt();
        System.out.print("Masukkan harga per ikan: ");
        int hargaPerIkan = sc.nextInt();
        int gaji = jumlahIkan * hargaPerIkan;
        System.out.println("Gaji Nelayan: Rp" + gaji);
    }
}
