package latihan6.constructorOverloading;

/**
 * ==== Constructor Overloading ====
 * sama seperti di method, di constructor pun bisa melakukan overloading
 * kita bisa membuat constructor lebih dari satu, dengan syarat tipedata parameter harus berbeda, atau jumlah parameter harus berbeda
 *
 * ==== Memangil constructor lain ====
 * constructor bisa memangil constructor lain
 * hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
 * cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method namun menggunakan kata kunci this
 */

//class
class Person {
    //field
    String name;
    String address;
    final String country = "Indonesia";

    //constructor
    Person(String ParamName, String ParamAddress){
        name = ParamName;
        address = ParamAddress;
    }

    //constructor Overloading
    Person(String ParamName){
        this(ParamName,null);
    }
    //constructor OverLoading
    Person(){
        this(null);
    }
}
