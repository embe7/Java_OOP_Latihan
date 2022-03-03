package latihan34.EnumClass.Latihan1;

public enum Gender {
    MALE("Pria"),
    FEMALE("wanita");

    private String descriptions;

    Gender (String description){
        this.descriptions = description;
    }

    public String getDescriptions() {
        return descriptions;
    }
}
