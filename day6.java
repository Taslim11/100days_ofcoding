
package day2;

import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        int password;
        System.out.print("Masukkan Username : ");
        username = sc.nextLine();
        System.out.print("Masukkan Password : ");
        password = sc.nextInt();
        if("taslim".equals(username) && password == 123456){
            System.out.println("login sukses");
        }else{
            System.out.println("Login Gagal");
        }
    }
    
}
