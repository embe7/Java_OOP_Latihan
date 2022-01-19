package latihan15.VariabelHiding;

class Child extends Parent {
    String name;
    void doIt(){
        System.out.println("do it from Child" + name);
        System.out.println("do it from Parent" + super.name);
    }
}
