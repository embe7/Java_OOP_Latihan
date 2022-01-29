package latihan22.GetterDanSetter;

import java.security.KeyStore;

/**
 * - Encapsulation
 * - encapsulation artinya memasukkan data sensitif sebuah object tersebut dari akses luar
 * - hal ini bertujuan agar kita bisa menjagaga agar data sebuah object tetap baik dan valid
 * - Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private,
 *   sehingga tidak bisa di akses atau diubah dari luar
 * - agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut
 *
 * ==== Getter Dan Setter ====
 * - di java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan Getter dan
 *   Setter method
 * - Getter adalah function yang dibuat untuk mengambil data field
 * - Setter adalah function untuk mengubah data field
 */

public class GetterDanSetterApp {
    public static void main(String[] args) {
        Category category = new Category();

        category.setId("Suhendri");
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());

    }
}
