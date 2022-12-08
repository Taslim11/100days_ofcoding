
package day2;

import java.util.Scanner;

public class day53 {
  public static void main(String args[]){      
    Scanner input = new Scanner(System.in);
    double r, luas;
  
    System.out.print("Input jari-jari lingkaran: ");
    r = input.nextDouble();
   
    luas = 3.14 * r * r;
       
    System.out.println("Luas lingkaran: "+luas);
  
  }
}

