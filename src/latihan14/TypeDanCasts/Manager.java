package latihan14.TypeDanCasts;

class Manager extends TypeDanCasts {

    //constructor
    Manager(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("Hello " + name + " My name is Manager " + this.name );
    }
}
