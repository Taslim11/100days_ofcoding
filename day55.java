
package day2;

public class day55 {
    public static void main(String[] args) {
        int [][] array = {{21, 50, 40,22},
                         {31, 20, 55, 20},
                         {20, 21, 33, 90}};
        
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
