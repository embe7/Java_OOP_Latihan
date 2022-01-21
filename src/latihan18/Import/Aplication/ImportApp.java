package latihan18.Import.Aplication;

//import
import latihan18.Import.Data.Product;

/**
 * Import
 * - impor adalah kemampuan untuk menggunakan class yang berada di package yang berbeda
 * - syarat class yang bisa digunakan jika package nya berbeda adalah class yang harus public
 *
 * Import Semua Package
 * - jika kita ingin meng-Inport semua class di dalam sebuah package, kita bisa menggunalan tanda * (Bintang)
 *
 * Default Import
 * - secara default semua class yang ada di package java.lang sudah auto import, jadi kita tidak perlu
 *   melakukan import secara manual
 * - contoh class String, Integer, Long, Boolean, dan lain lain terdapat di package java.lang.
 *   oleh karena itu, kita tidak perlu meng-import nya secara manual
 */

public class ImportApp {
    public static void main(String[] args) {
        Product product = new Product("Acer",4_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
