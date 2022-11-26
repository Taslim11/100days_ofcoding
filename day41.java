
package day2;

public class day41 {
    public static void main(String[] args) {
        int [][] array = {{20, 30, 45,32},
                         {31, 20, 55, 20},
                         {20, 21, 33, 90}};
        
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
