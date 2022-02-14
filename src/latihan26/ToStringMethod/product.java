package latihan26.ToStringMethod;

class product {
    String name;
    int price;

    product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Name : " + name + " Price : " + price;
    }
}
