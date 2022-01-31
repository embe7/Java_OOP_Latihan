package latihan24.InterfaceInheritance;

public class Avanza implements Car {

    public void Driver(){
        System.out.println("Driver");
    }

    public int getTire(){
        return 4;
    }

    public String getBrand(){
        return "Toyota";
    }

    public String getMekanik(){
        return "Suhendri";
    }
}
