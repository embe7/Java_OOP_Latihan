package latihan27.EqualsMethod;

class Product {
    String names;
    int prices;

    Product(String name,int price){
        this.names = name;
        this.prices = price;
    }

    public String toString(){
       return "Name : " + names + ", Price : Rp." + prices;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (prices != product.prices) return false;
        return names != null ? names.equals(product.names) : product.names == null;
    }
}
