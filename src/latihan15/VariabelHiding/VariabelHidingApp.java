package latihan15.VariabelHiding;

public class VariabelHidingApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = " suhendri";
        child.doIt();

        //konversi
        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
