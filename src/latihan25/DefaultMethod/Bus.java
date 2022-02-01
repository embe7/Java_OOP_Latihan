package latihan25.DefaultMethod;

public class Bus implements Car {

    public String getDrive() {
        return "Drive Bus";
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "Mitsudisi";
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
