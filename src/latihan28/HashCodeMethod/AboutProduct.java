package latihan28.HashCodeMethod;

 class AboutProduct {
    protected String names;
    protected int prices;

    AboutProduct(String name, int price){
        this.names = name;
        this.prices = price;
    }

     public String toString(){
         return "name : " + this.names + ", Price : Rp." + this.prices;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         AboutProduct that = (AboutProduct) o;

         if (prices != that.prices) return false;
         return names != null ? names.equals(that.names) : that.names == null;
     }

     @Override
     public int hashCode() {
         int result = names != null ? names.hashCode() : 0;
         result = 31 * result + prices;
         return result;
     }
 }
