
package day2;

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int nilai = sc.nextInt();
        System.out.println("nilai anda :");
         if(nilai < 60){
             System.out.println("d");
         }
         else if(nilai > 60&& nilai < 70){
            System.out.println("c");
         }
         else if(nilai >70 && nilai <85){
             System.out.println("b");
         }
         else if(nilai > 85 && nilai <= 100){
             System.out.println("a");
         }
         else{
             System.out.println("nilai anda kelebihan");
         } 
    }
        
}
