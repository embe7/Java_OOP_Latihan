package latihan6.constructorOverloading;

public class ConstructorOverloadingApp {
    public static void main(String[] args) {
        var person1 = new Person("Suhendri","Aceh");

        var person2 = new Person("Nita");

        var person3 = new Person();

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        System.out.println(person2.name);
    }
}
