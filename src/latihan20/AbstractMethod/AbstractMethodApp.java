package latihan20.AbstractMethod;

/**
 * Abstract Method
 * - Saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class
 *   abstract tersebut
 * - saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebut
 * - Artinya, abstract method wajib di override di class child
 * - abstract method tidak bleh memiliki access modifier private
 *
 * - turunan dari class parent wajib meng-override method abstract
 */

public class AbstractMethodApp {
    public static void main(String[] args) {
        Animals cat = new Cat();
        cat.name = "Kitty";
        cat.run();
    }
}
