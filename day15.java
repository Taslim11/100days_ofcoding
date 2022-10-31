
package day2;

import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nama;
    int nilai;
    
        System.out.print("Masukkan nama Mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Masukkan nilai Mahasiswa : ");
        nilai = sc.nextInt();
        
        if(nilai > 50 ){
            System.out.println("Lulus");
        }else{
            System.out.println("Tidak Lulus");
        }
    }
    
    
    
}
