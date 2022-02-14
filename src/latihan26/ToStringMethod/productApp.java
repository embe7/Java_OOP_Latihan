package latihan26.ToStringMethod;

/**
 * ToString Method
 * - adalah method yang terdapat pada class object
 * - method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String
 * - secara default, toString() ini akan menghasilkan : namaclass + @@ + hasCode
 * - namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca
 */

public class productApp {
    public static void main(String[] args) {
        product product1 = new product("Acer",4_000_000);

        System.out.println(product1);
    }
}
