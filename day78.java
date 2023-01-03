
package day2;

import java.util.Scanner;

public class day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang tanah: ");
        int panjangTanah = sc.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        int lebarTanah = sc.nextInt();
        int luasTanah = panjangTanah * lebarTanah;
        int hargaJualTotal = luasTanah * 300000;
        System.out.println("=============================");
        System.out.println("harga tanah per meter : 300000");
        System.out.println("panjang tanah : "+ panjangTanah);
        System.out.println("lebar tanah : "+ lebarTanah);
        System.out.println("Harga jual total: " + hargaJualTotal);
  }
}
