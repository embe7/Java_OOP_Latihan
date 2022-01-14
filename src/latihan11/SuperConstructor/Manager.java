package latihan11.SuperConstructor;

/**
 * SUPER CONSTRUCTOR
 * - tidak hanya untuk mengakses method atau field  yang ada di parent class, kata kunci super juga juga bisa digunakan
 *   untuk mengakses constructor
 * - namun syaratnya untuk mengakses parent class constructor, kta harus mengakses nya di dalam class child constructor
 * - jika sebuah class parent tidak memiliki contructor yang tidak ada parameternya ( TIDAK MEMILIKI DEFAULT CONSTRUCTOR)
 *   maka class child wajib mengakses  constructor class parent tersebut
 */

//parent class
class Manager {

    String name;

    //constructor
    Manager(String name){
        this.name = name;
    }

    //method
    void sayHello(String name){
        System.out.println("Hi, " + name + " My name is " + this.name);
    }
}

//class child
class vicePresident extends Manager{

    //constructor
    vicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi, " + name + " My name is " + this.name);
    }
}
