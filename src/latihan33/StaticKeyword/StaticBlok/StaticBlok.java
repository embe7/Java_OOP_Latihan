package latihan33.StaticKeyword.StaticBlok;

public class StaticBlok {

    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses Aplikasi");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
