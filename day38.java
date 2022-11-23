
package day2;

import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "TASLIM";
        String pass = "allcode__";
        
        System.out.print("Masukan Username : ");
        String username = sc.nextLine();
        System.out.print("Masukan Password : ");
        String password = sc.nextLine();
        
        if(username.equals(user) && password.equals(pass)){
            System.out.println(" LOGIN SUKSES ");
        }else{
            System.out.println(" LOGIN GAGAL ");
        }
    }
}
