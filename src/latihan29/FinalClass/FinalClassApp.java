package latihan29.FinalClass;

/**
 * Final Class
 * - Sebelumnya kita pernah menggunakan kata kunci final di java.
 * - jika digunakan di variabel, maka variabel tersebut tidak bisa diubah lagi datanya.
 * - final pun juga bisa digunakan di class, dimana jika kita menggunakan kata kunci final sebelum class,
 *   maka kita menandakan bahwa class tersebut tidak bisa diwariskan lagi.
 * - maka otomatis semua class child nya akan error
 */

class FinalClassApp {

}

final class Final extends FinalClassApp{

}

//Eror
//  class FakeFinal extends Final{
//  }
