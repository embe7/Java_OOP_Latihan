package latihan30.FinalMethod;

/**
 * Final Method
 * - kata kunci final juga bisa digunakan di method
 * - jika sebuah method menggunakan kata kunci final, maka artinya method tersebut tidak bisa di
 *   overide di class child nya.
 * - ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi
 *   oleh class child nya.
 */

public class FinalMethodApp {
}

class SocialMedia{

}

class facebook extends SocialMedia{
    final void login(String UserName, String password){

    }
}

class FakeFacebook extends facebook{
    //Erorr
//    void login(String UserName,String password){
//     }
}