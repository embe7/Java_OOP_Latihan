package latihan8.inheritance;

/**
 * ==== Inheritance ====
 * - Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
 * - Dalam artian, kitabisa menbuat class Paren(orangtua) dan kelas child(anak)
 * - Class Child, hanya bisa punya satu kelas Parent, namun satu kelas parent bisa punya banyak class child
 * - Saat sebuah Class diturunkan, maka semua field dan method yang ada di class parent, secara otomatis akan dimiliki
 *   oleh class Child
 * - Untuk melakukan pewarisan, di class child kita harus menggunakan kata kunci extends lalu diikuti dengan nama class Parentnya
 */

//class (Parent)
class Manager {
    //field
    String name;
    String address;
    final String country = "Indonesia";

    //method
    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + " My name is " + this.name);
    }
}
