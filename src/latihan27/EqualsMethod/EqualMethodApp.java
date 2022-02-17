package latihan27.EqualsMethod;

/**
 * Equals Method
 * - Hal yang agak membingungkan di java adalah, cara membandingkan object
 * - Di bahasa pemrograman lain, untuk mengecek apakan sebuah object sama, biasanya menggunakan operator ==, di java,
 *   operator == hanya untuk mengecek data primitif
 * - untuk non primitif penegecekannya menggunakan method equals
 * - dan secara default, method equal itu akan membandingkan dua buah object secara kesamaan pososi object di memory,
 *   artinya jika kita membuat 2 object yang isi fieldnya sama, tetap dianggap beda oleh method equals
 * - oleh karena itu, ada baiknya kita meng-overide method equals milik class object tersebut.
 */

public class EqualMethodApp {
    public static void main(String[] args) {
        Product data1 = new Product("Acerr",4_000_000);
        System.out.println(data1);

        Product data2 = new Product("Lenovo",5_000_000);
        System.out.println(data2);

        System.out.println(data1.equals(data2));
    }
}
