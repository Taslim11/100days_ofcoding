
package day2;

import java.util.ArrayList;

public class day83 {
    public static void main(String[] args) {
        ArrayList<String> daftarBarang = new ArrayList<>();

        daftarBarang.add("Mie Instan");
        daftarBarang.add("Shampoo");
        daftarBarang.add("Sabun Mandi");
        daftarBarang.add("Kopi Bubuk");
        daftarBarang.add("Beras");

        System.out.println("Daftar Barang:");
        for (int i = 0; i < daftarBarang.size(); i++) {
          System.out.println((i + 1) + ". " + daftarBarang.get(i));
        }
    }
}
