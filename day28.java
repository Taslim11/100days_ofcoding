
package day2;

public class day28 {
    public static void main(String[] args) {
        int jumlah = 0;
        for (int i = 100; i >= 1; i--) {
            if(i % 3 != 0){
                jumlah += i;
            }System.out.println(i);
        }System.out.println(jumlah);
    }
}
