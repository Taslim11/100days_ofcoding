
package day2;

import java.util.Scanner;

//latihan soal
//menghitung gaji karyawan,
//pada perusahaan buruh tali karyawannya di gaji Rp.80,000 apabila
//telah menyelesaikan mengerjakan tali sebanyak 1 ton
//dan bisa dikerjakan secara berkelompok.
//jadi yang dicari adalah total gaji dan gaji per orang
//dengan inputan jumlah karyawan dan jumlah tali yang selesai di kerjakan


public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gaji, jumlahTali, jumlahKaryawan, totalGaji, gaji_perorang;
        gaji = 80000;
        System.out.print("Jumlah Karyawan : ");
        jumlahKaryawan = sc.nextInt();
        System.out.print("Jumlah Tali : ");
        jumlahTali = sc.nextInt();
        System.out.println("===============================");
        System.out.println("Jumlah Karyawan : "+ jumlahKaryawan + " orang");
        System.out.println("Jumlah Tali : "+ jumlahTali + " ton");
        totalGaji = gaji * jumlahTali;
        System.out.println("Total gaji : " + totalGaji);
        gaji_perorang = gaji * jumlahTali / jumlahKaryawan;
        System.out.println("Gaji Per orang : " + gaji_perorang);
    }
}


