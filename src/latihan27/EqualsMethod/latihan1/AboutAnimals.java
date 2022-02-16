package latihan27.EqualsMethod.latihan1;

class AboutAnimals {
    String names;
    int legs;

    AboutAnimals(String name,int leg){
        this.names = name;
        this.legs = leg;
    }

    public String toString(){
        return "Name : " + names + ", Leg :" + legs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AboutAnimals that = (AboutAnimals) o;

        if (legs != that.legs) return false;
        return names != null ? names.equals(that.names) : that.names == null;
    }
}
