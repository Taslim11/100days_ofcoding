package day2;

import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner cepmek = new Scanner(System.in);
        String namaDepan, namaBelakang;
        
        System.out.print("Masukkan Nama Depan : ");
        namaDepan = cepmek.nextLine();
        System.out.print("Masukkan Nama Belakang : ");
        namaBelakang = cepmek.nextLine();
        
        System.out.format("Nama Saya Adalah %s %s %n", namaDepan, namaBelakang);
    }
}
