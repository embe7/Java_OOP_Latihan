package latihan5.constructor;

public class ConstructorApp {
    public static void main(String[] args) {

        var person1 = new Person("suhendri","Takengon");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        var person2 = new Person("Nita","Medan");
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
    }
}
