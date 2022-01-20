package latihan17.AccessModifier;

/**
 * - "Protected" hanya bisa di akses di turunannya atau di package yang sama
 * - "Private" hanya bisa di akses di dalam class nya saja
 * - "Public" bisa di akses dimana pun walaupun di package yang berbeda
 */

public class Product {
    //atribut
    protected String name;
    protected int price;
    //constructor
    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
}
