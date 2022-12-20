
package day2;

public class day64 {
    public static void main(String[] args) {
    int n = 10;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println(); 
    }
  }
}
