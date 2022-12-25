
package day2;

public class day68 {
    public static void main(String[] args) {
        int size = 30;

        for (int row = -size; row <= size; row++) {
          for (int col = -size; col <= size; col++) {
            double distance = Math.sqrt(row * row + col * col);
            
            if (distance <= size) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
          System.out.println();
    }
  }
}
