package latihan7.ThisKeyword;

/**
 * ==== This Keyword ====
 * - saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata kunci this
 *   untuk mengakses object saat ini
 * - misalnya saat kita mau mengakses sebuah field yang namanya sama dengan parameter method, hal ini tidak bisa dilakukan
 *   bila langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata kunci this
 * - This tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method
 * - This bisa digunakan untuk mengatasi masalah variabel shadowing
 */

//class
class Person {
    //field
    String name;
    String address;
    final String country = "Indonesia";

    //constructor
    Person(String ParamName, String ParamAddress){
        //keyword this
        this.name = ParamName;
        this.address = ParamAddress;
    }
    //method
    void sayHello(){
        sayHello();
    }
    //method Overloading
    void sayHello(String name){
        System.out.println("Hello " + name + " Nama Saya " + this.name);
    }
}
