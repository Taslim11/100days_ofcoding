 
package day2;

import java.util.Scanner;

public class day70 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pemerintah desa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jumlah anggota keluarga: ");
        int jumlahAnggotaKeluarga = input.nextInt();
        System.out.print("Masukkan jumlah penduduk desa: ");
        int jumlahPendudukDesa = input.nextInt();
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        double bonusGaji = 0;
        if (jumlahAnggotaKeluarga <= 3) {
          bonusGaji = 0.1 * gajiPokok;
        } else if (jumlahAnggotaKeluarga <= 5) {
          bonusGaji = 0.2 * gajiPokok;
        } else {
          bonusGaji = 0.3 * gajiPokok;
        }

        double tunjangan = 0;
        if (jumlahPendudukDesa < 1000) {
          tunjangan = 0.05 * gajiPokok;
        } else if (jumlahPendudukDesa < 5000) {
          tunjangan = 0.1 * gajiPokok;
        } else {
          tunjangan = 0.2 * gajiPokok;
        }

        double gajiTotal = gajiPokok + bonusGaji + tunjangan;

        System.out.println("Nama pemerintah desa: " + nama);
        System.out.println("Gaji total: " + gajiTotal);
  }
}
