package latihan3.field;

public class FieldApp {
    public static void main(String[] args) {

        var person1 = new Person();
        person1.name = "Suhendri";
        person1.address = "Medan";

        var person2 = new Person();
        person2.name = "Budi";
        person2.address = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
    }
}
