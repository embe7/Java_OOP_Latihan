package latihan13.Polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employe employee = new Employe("Suhendri");
        employee.sayHello("Fahri");

        employee = new Manager("Budi");
        employee.sayHello("Anduk");

        employee = new VicePresident("Putri");
        employee.sayHello("Jaka");


        sayHello(new Employe("Alwi"));
        sayHello(new Manager("Abizar"));
        sayHello(new VicePresident("Anggik"));
    }
    //Kode Method penggunaan Polymorphism
    static void sayHello(Employe employee){
        System.out.println("Hello " + employee.name);
    }
}
