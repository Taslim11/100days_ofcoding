
package day2;

import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
    Scanner allcode = new Scanner(System.in);
    String nama, nim;
    int usia;
        System.out.print("Nama : ");
        nama = allcode.nextLine();
        System.out.print("NIM : ");
        nim = allcode.nextLine();
        System.out.print("Usia : ");
        usia = allcode.nextInt();
        
        System.out.println("\nNama : " + nama + "\nNIM : " + nim + "\nUsia : " + usia + " Tahun");
        
    }
    
    
    
}
