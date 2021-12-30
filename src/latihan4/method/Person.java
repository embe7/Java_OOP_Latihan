package latihan4.method;

/*
    METHOD
    - selain menambahkan fields, kita juga bisa menambahkan object ke dalam class
    - caranya dengan mendeklarasikan method tersebut di dalam blok class
    - sama seperti method biasanya, kita juga bisa menambahkan return value, parameter
      dan methdod overloading di method yang ada di dalam blok class
    - untuk mengakses method tersebut, kita bisa menggunakan tanda titik(.) dan diikuti dengn nama method nya.
 */

class Person {
    //fields

    final String nameApp = "JombloAkut";

    //method
    void sayHello(String name){
        System.out.println("Hi " + name + " selamat datang di Aplikasi " + nameApp);
    }
}
