
package day2;

public class day23 {
    public static void main(String[] args) {
        String hasil = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                hasil += "*";
            }
            hasil += "\n";
        }
        System.out.println(hasil);
    }
}
