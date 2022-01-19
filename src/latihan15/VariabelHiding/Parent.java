package latihan15.VariabelHiding;

/**
 * Variabel Hiding
 * - Variabel hiding merupakan masalah yang terjadi ketika kita membuat nama field yang sama di class child dengan
 *   nama field di class parent
 * - tidak ada yang namanya field overriding, ketika kita membuat ulang nama field di class class, itu berarti
 *   variabel hiding
 * - untuk mengatasi variabel hiding, caranya kita bisa menggunakan super keyword
 * - yang membedakan varibel hiding dan method overriding adalah ketika sebuah object di cats
 * - saat object di casts, method akan tetap mengakses method oveerriding, namun variabel akan mengakses  variabel
 *   yang ada di class nya
 */

class Parent {
    String name;
    void doIt(){
        System.out.println("do it from Parent");
    }
}
