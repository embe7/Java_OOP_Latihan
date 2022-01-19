package latihan14.TypeDanCasts;

/**
 * Type Check & Casts
 * - Sebelumnya kita sudah tau cara melakukan konversi tipe data (cast) di tipe data primitif
 * - Casts juga bisa digunakan untuk tipe data bukan primitif
 * - Namun agar aman, sebelum melakukan casts, pastikan kita melakukan type check(pengecekan tipe data), dengan
 *   menggunakan kata kunci instanceof
 * - Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai
 */

class TypeDanCasts {
    String name;

    //constructor
    TypeDanCasts(String name){
        this.name = name;
    }
    void sayHello(String name){
        System.out.println("Hello " + name + " My name is Type&Cast " + this.name );
    }
}
