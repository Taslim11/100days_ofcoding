
package day97;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah ikan yang ditangkap pada musim barat: ");
        int jumlahIkanBarat = input.nextInt();
        System.out.print("Masukkan harga per ikan pada musim barat: ");
        int hargaPerIkanBarat = input.nextInt();
        int pendapatanBarat = jumlahIkanBarat * hargaPerIkanBarat;
        
        System.out.print("Masukkan jumlah ikan yang ditangkap pada musim timur: ");
        int jumlahIkanTimur = input.nextInt();
        System.out.print("Masukkan harga per ikan pada musim timur: ");
        int hargaPerIkanTimur = input.nextInt();
        int pendapatanTimur = jumlahIkanTimur * hargaPerIkanTimur;
        
        int totalPendapatan = pendapatanBarat + pendapatanTimur;
        System.out.println("Total pendapatan nelayan pada musim barat: Rp" + pendapatanBarat);
        System.out.println("Total pendapatan nelayan pada musim timur: Rp" + pendapatanTimur);
        System.out.println("Total pendapatan nelayan selama 2 musim: Rp" + totalPendapatan);
    }
}
