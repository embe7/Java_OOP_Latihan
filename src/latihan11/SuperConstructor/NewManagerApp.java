package latihan11.SuperConstructor;

public class NewManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Suhendri");

        manager.sayHello("fahri");

        var vp = new vicePresident("Joko");
        vp.sayHello("budi");
    }
}
