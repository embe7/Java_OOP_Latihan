package latihan34.EnumClass;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * ==== Enum Class ====
 * - saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis jenis data yang nilainya terbatas.
 * - misal, gender, ada male dan female, atau tipe costumer, ada standard, premium atau vip, dan lain-lain.
 * - dalam kasus seperti ini, kita bisa menggunakan enum class yaitu class yang berisikan nilai terbatas
 *   yang sudah ditentukan.
 * - saat membuat ennum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu
 *   class enum tidak bisa extends class lain, namun tetap bisa implements interface
 *
 * ==== Enum Members ====
 * - sama seperti class biasanya, di class enum pun kita bisa menambahkan members(field, method, dan constructor).
 * - khusus constructor, kita tidak bisa membuat public constructor, karena meman tujuan enum bukan untuk di
 *   instansi secara bebas
 */

public class EnumClassApp {
    public static void main(String[] args) {
        Customer pembeli = new Customer();

        pembeli.setNames("Suhendri");
        pembeli.setLevel(Level.STANDARD);

        System.out.println(pembeli.getNames());
        System.out.println(pembeli.getLevel());
        System.out.println(pembeli.getLevel().getDescriptions());

        //Konversi Enum ke String
        String LevelName = Level.VIP.name();
        System.out.println(LevelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        //mengecek enum yang ada
        System.out.println("print level");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
