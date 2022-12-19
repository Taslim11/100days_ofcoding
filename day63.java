
package day2;

import java.util.Scanner;

public class day63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang tanah : ");
        double panjangTanah = sc.nextDouble();
        System.out.print("Masukkan lebar tanah : ");
        double lebarTanah = sc.nextDouble();
        double luasTanah = panjangTanah * lebarTanah;
        System.out.print("Masukkan harga tanah per meter : ");
        double hargaTanahPerMeter = sc.nextDouble();
        double hargaTanah = luasTanah * hargaTanahPerMeter;
        System.out.println("Harga tanah adalah: Rp." + hargaTanah);
    }
}
