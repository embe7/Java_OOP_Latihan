package latihan9.MethodOverriding;

//class child
class VicePresident extends Manager {

    void sayHello(String ParamName){
        System.out.println("Hello " + ParamName + ", I'm VicePresident, and my name is " + this.name);
    }
}
