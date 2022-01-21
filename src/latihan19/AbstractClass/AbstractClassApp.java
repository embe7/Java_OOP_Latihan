package latihan19.AbstractClass;

/**
 * Abstract Class
 * - Saat kita membuat class, kita bisa menjadikan class sebagai abstract class.
 * - Abstract class artinya, class tersebut tidak bisa dibuat dibuat sebagai object secara langsung,
 *   hanya bisa diturunkan
 * - untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum
 *   kata kunci class
 * - dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child
 */

public class AbstractClassApp {
    public static void main(String[] args) {
        // kode Error Location location = new Location();

        City city = new City();
        city.name="Medan";

        System.out.println(city.name);
    }
}
