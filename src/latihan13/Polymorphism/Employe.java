package latihan13.Polymorphism;

/**
 * Polymorphism
 * - Polymorphim berasal dari bahasa yunani yang berarti banyak bentuk.
 * - dalam OOP, Polymorphism adalah sebuah kemampuan object berubah bentuk menjadi bentuk lain
 * - polimorphism erathubungannya dengan inheritance/pewarisan
 */

class Employe {
    String name;

    //constructor
    Employe(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hi " + name + " My name is Employee " + this.name);
    }
}
