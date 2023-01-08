
package day2;

import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah utang: ");
        int utang = sc.nextInt();
        System.out.print("Masukkan suku bunga per tahun (dalam persen): ");
        int sukuBunga = sc.nextInt() / 100;
        System.out.print("Masukkan jangka waktu (dalam tahun): ");
        int jangkaWaktu = sc.nextInt();

        int totalUtang = utang + (utang * sukuBunga * jangkaWaktu);

        System.out.println("Total utang yang harus dibayar: " + totalUtang);
    }
}

