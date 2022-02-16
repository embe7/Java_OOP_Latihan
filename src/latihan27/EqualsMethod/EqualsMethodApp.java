package latihan27.EqualsMethod;

/**
 * Equals Method
 * - hal yang agak membingungkan di java adalah, cara membandingkan object
 * - dibahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==,
 *   di java, operator == hanya untuk mengecek data primitif
 * - untuk non primitif pengecekannya menggunakan method equals
 * - dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di
 *   memory, artinya jika kita membuat 2 object yang isi field nya sama, tetap di anggap beda oleh method equaals
 * - oleh karena itu, ada baiknya kita meng-override method equals milik class object tersebut
 */

public class EqualsMethodApp {

    public static void main(String[] args) {

        String data = "Suhendri";
        data = data + " " + "18110460";
        System.out.println(data);

        String second = "Suhendri 18110460";
        System.out.println(second);

        System.out.println(data == second);
        System.out.println(data.equals(second));

        String third = "Suhendri 18110460";
        System.out.println(third == second);
        System.out.println(third.equals(second));

        //============================================

        Product DataProduk = new Product("Acer",4_000_000);
        System.out.println(DataProduk);

    }
}
