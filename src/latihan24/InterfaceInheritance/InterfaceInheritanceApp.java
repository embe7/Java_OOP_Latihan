package latihan24.InterfaceInheritance;

/**
 * Interface Inheritance
 * - sebelumnya kita sudah tau kalau di java, child class hanya bisa punya 1 class parent
 * - namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
 * - bahkan interface pun bisa implement interface lain, bisa lebih dari 1. namun jika interface ingin mewarisi
 *   interface lain, kita menggunakan kata kunci extends, bukan implements
 */

public class InterfaceInheritanceApp {
    public static void main(String[] args) {
        Car car = new Avanza();

        car.Driver();
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        System.out.println(car.getMekanik());
    }
}
