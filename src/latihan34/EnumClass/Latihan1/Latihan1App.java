package latihan34.EnumClass.Latihan1;

public class Latihan1App {
    public static void main(String[] args) {
        Customer1 suhendri = new Customer1();

        suhendri.setName("suhendri");
        suhendri.setGender(Gender.MALE);

        System.out.println(suhendri.getName());
        System.out.println(suhendri.getGender().getDescriptions());

        //konversi enum ke string

        String Cwek = Gender.FEMALE.name();
        System.out.println(Cwek);

        Gender GenderCwek = Gender.valueOf("FEMALE");
        System.out.println(GenderCwek);

        System.out.println("Print Gender");
        for ( var value : Gender.values()){
            System.out.println(value);
        }
    }
}
