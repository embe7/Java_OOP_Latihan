package latihan14.TypeDanCasts;

class VicePresident extends Manager {

    //constructor
    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + " My name is VicePresident " + this.name );
    }
}
