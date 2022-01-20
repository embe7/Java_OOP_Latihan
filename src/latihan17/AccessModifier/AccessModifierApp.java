package latihan17.AccessModifier;

/**
 * Public Class
 * - saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java
 * - selain itu, nama public class harus sama dengan nama file
 */

public class AccessModifierApp {
    public static void main(String[] args) {
        Product product = new Product("Accer",4_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
