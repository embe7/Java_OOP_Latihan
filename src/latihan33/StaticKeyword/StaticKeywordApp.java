package latihan33.StaticKeyword;

import latihan33.StaticKeyword.StaticBlok.StaticBlok;
import latihan33.StaticKeyword.StaticField.StaticField;
import latihan33.StaticKeyword.StaticInnerClass.StaticInnerClass;
import latihan33.StaticKeyword.StaticMethod.StaticMethod;

/**
 * ==== Static Keyword ====
 * - Sebelumnya kita sudah sering melihat kata knci static, namun belum pernah kita bahas.
 * - Dengan menggunakan kata kunci static, kita bisa membuat fied, method atau class bisa di akses langsung
 *   tanpa melalui object nya.
 * - Perlu dingat, static hanya bisa mengakses ststic lainnya.
 *
 * ==== Static Dapat Digunakan di ====
 * - Field, atau disebut class variabel, artinya field tersebut bisa diakses langsung tanpa membuat
 *   object terlebih dahulu
 * - Method, atau disebut class method, artinya method tersebut dapat di akses langsung tanpa membuat object
 *   terlebih dahulu
 * - Block, static blok akan otomatis dieksekusi ketika sebuah class di load
 * - Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa membuat object outer class
 *   terlebih dahulu. static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya
 */

public class StaticKeywordApp {
    public static void main(String[] args) {
        System.out.println(StaticField.APPLICATION);
        System.out.println(StaticField.VERSION);

        System.out.println(StaticMethod.sum(1,2,3,4,5));

        StaticInnerClass.city data = new StaticInnerClass.city();
        data.setName("Medan");

        System.out.println(data.getName());

        System.out.println(StaticBlok.PROCESSOR);
    }
}
