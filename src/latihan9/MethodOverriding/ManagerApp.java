package latihan9.MethodOverriding;

public class ManagerApp {
    public static void main(String[] args) {
        var manager1 = new Manager();
        var vp = new VicePresident();

        manager1.name = "Suhendri";
        manager1.sayHello("budi");

        vp.name = "Joko";
        vp.sayHello("Nita");

    }
}
