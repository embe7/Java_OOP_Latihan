package latihan13.Polymorphism;

class VicePresident extends Manager{

    //constructor
    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hi " + name + " My name is VicePresident " + this.name);
    }
}
