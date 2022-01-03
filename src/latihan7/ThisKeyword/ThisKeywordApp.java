package latihan7.ThisKeyword;

public class ThisKeywordApp {
    public static void main(String[] args) {
        //membuat object
        var person1 = new Person("Suhendri","Takengon");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //mengakses method di class Person
        person1.sayHello("Budi");
    }
}
