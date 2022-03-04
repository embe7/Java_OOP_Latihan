package latihan35.Exception;

/**
 * ==== Exception ====
 * - Saat kita membuat aplikasi kita tidak akan terhindar dengan yang namanya error
 * - Di java, error direpresentasikan dengan istilah exception, dan semua dipresentasikan dalam bentuk class exception
 * - Kita bisa menggunkan class exception sendiri, atau menggunakan yang sudah disediakan di java
 * - Jika kita ingin membuat exception, maka kita harus membuat class yang extends class throwable atau turunan- turunannya
 *
 * ==== Membuat Exception ====
 * - Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus
 *   ditandai dengan kata kunci throws diikuti dengan class exception nya.
 * - jika method tersebut bisa menimbulkan lebih dari satu exception, kita bisa menambah lebih dari satu class exception
 * - didalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw,diikuti dengan object
 *   exception nya
 *
 * ==== Try Catch ====
 * - saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch
 *   expresion di java
 * - ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception
 *   maka secara otomatis program kita akan berhenti
 * - cara menggunakan try-catch expression di java sangat mudah, di block try, kita tinggal memanggil method yang
 *   menyebabkan exception, dan di block catch, kita bisa melakukan sesuatu jika terjadi exception
 *
 * ==== Finally Keyword ====
 * - dalam try-catch, kita bisa menambahkan block finally
 * - block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak
 * - ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita
 *   ingin membaca file, di block catch kita akan tangkap jika terjadi error, dan di block finally error ataupun sukses
 *   membaca file, kita wajib menutup koneksi ke file tersebut, biar tidak menggantung di memory
 */

public class ExceptionApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("SUHENDRI","rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        }catch (ValidateException | NullPointerException exception){
            System.out.println("Data tidak valid : " + exception.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }
    }
}
