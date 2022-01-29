package latihan22.GetterDanSetter;

class Category {
    private String Id;
    private boolean expensive;



    public String getId() {
        return Id;
    }

    public void setId(String id) {
        if (id != null){
            this.Id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
