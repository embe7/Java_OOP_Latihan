package latihan14.TypeDanCasts;

public class TypeDanCastApp {
    public static void main(String[] args) {
        TypeDanCasts Data = new TypeDanCasts("Suhendri");
        Data.sayHello("Fahri");

        Data = new Manager("Budi");
        Data.sayHello("Doremi");

        Data = new VicePresident("Putra");
        Data.sayHello("Putri");

        sayHello(new TypeDanCasts("Suhendri"));
        sayHello(new Manager("Budi"));
        sayHello(new VicePresident("doremi"));
    }
    //Kode Method penggunaan Polymorphism dan penggunaan TypeDanCasts
    static void sayHello(TypeDanCasts Data){
        if (Data instanceof VicePresident){
            //konversi
            VicePresident vicePresident = (VicePresident) Data;
            System.out.println("Hello Manager " + vicePresident.name);
        }else if(Data instanceof Manager){
            //Konversi
            Manager manager = (Manager) Data;
            System.out.println("Hello VicePresident " + manager.name);
        }else {
            System.out.println("hello " + Data.name);
        }
    }
}
