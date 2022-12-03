
package day2;

import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Masukkan nama Mahasiswa : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan nilai Mahasiswa : ");
            int nilai = sc.nextInt();

            if(nilai == 100 ){
                System.out.println("Selamat anda Lulus di matakuliah ini");
            }else{
                System.out.println("Tidak Lulus, silahkan coba lagi tahun depan");
            }
    }
}
