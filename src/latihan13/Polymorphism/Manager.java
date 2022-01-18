package latihan13.Polymorphism;

class Manager extends Employe{

    //constructor
    Manager(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hi " + name + " My name is Manager " + this.name);
    }
}
