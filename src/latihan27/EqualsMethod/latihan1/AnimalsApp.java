package latihan27.EqualsMethod.latihan1;

public class AnimalsApp {
    public static void main(String[] args) {
        AboutAnimals kurakura = new AboutAnimals("Kurakura",4);
        System.out.println(kurakura);

        AboutAnimals copyKurakura = new AboutAnimals("Kurakura",4);
        System.out.println(copyKurakura);

        System.out.println(kurakura.equals(copyKurakura));
    }

}
