package latihan25.DefaultMethod;

public interface Car extends Maintenance, HasBrand {

    String getDrive();

    int getTire();

    default public boolean isBig(){
        return true;
    }
}
