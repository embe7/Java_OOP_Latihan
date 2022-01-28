package latihan21.RecursiveMethod;

/**
 *==== Recursive Method ====
 * - adalah kemampuan method memanggil method dirinya sendiri
 * - kadang memang ada banyak problem, yang lebih mudahh diselesaikan menggunakan recursive method,
 *   seperti contoh kasus factorial
 *
 *==== Problem Dengan Recursive ====
 * - walaupun recursive method itu sangat menarik, namun kita perlu berhati hati
 * - jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error stackOverflow, yaitu error
 *   dimana stack method terlalu banyak di java
 * - kenapa problem ini bisa terjadi? karena ketika kita memanggil method lain, maka stack akan
 *   menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error
 *   stackOverflow
 */

public class RecursiveMethodAPP {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(recursiveFactorial(5));

        looping(10000);
    }

    //menyelesaikan factorial menggunakan perulangan biasa
    static int factorial(int value){
        var result = 1;
        for (var i = 1 ; i <= value; i++){
            result *= i;
        }
        return result;
    }

    //recursive method
    static int recursiveFactorial(int value){
        if (value == 1){
            return 1;
        }else {
            return value * recursiveFactorial(value - 1);
        }
    }

    //Kode Error stackOverflow
    static void looping(int value){
        if (value == 0){
            System.out.println("Selesai");
        }else {
            System.out.println("Loping ke- " + value);
            looping(value - 1);
        }
    }
}
