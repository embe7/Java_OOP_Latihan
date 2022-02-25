package latihan34.EnumClass;

public enum Level {
    STANDARD("Strandart Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String descriptions;

    Level(String description){
        this.descriptions = description;
    }

    public String getDescriptions() {
        return descriptions;
    }
}
