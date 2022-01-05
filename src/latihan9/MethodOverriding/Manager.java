package latihan9.MethodOverriding;

/**
 * Method Overriding
 * - adalah kemampuan untuk mendeklarasikan ulang method di class Child, yang sudah ada di class parent
 * - saat kita melakukan peroses overriding tersebut, secara otomatis ketika kita membuat object dari class child,
 *   method di class parent tidak bisa di akses lagi
 */

//class parent
class Manager {
    //field
    String name;

    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + ", I'm Manager, and my name is " + this.name);
    }
}
