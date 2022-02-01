package latihan25.DefaultMethod;

/**
 * Default Method
 * - sebelumnya kita tahu bahwa interface, kita tidak bisa membuat method konkrit yang memiliki blok method
 * - namin sejak versi java 8, ada fitur default method interface
 * - fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement
 *   interface tersebut
 * - ketika kita menambah satu method di interface, secara otomatis semua class yang implement akan rusak karena harus
 *   meng-override method tersebut
 * - dengan menggunakan default method, kita bisa menambahkan konkrit method di interface
 */

public class DefaultMethodApp {
    public static void main(String[] args) {
        Car avanza = new Avanza();

        Car bus = new Bus();

        System.out.println(avanza.getDrive());
        System.out.println(avanza.getBrand());
        System.out.println(avanza.getTire());
        System.out.println(avanza.isMaintenance());
        System.out.println(avanza.isBig());

        System.out.println(bus.getDrive());
        System.out.println(bus.getBrand());
        System.out.println(bus.getTire());
        System.out.println(bus.isMaintenance());
        System.out.println(bus.isBig());
    }
}
