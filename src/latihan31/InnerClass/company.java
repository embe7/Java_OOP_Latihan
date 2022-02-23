package latihan31.InnerClass;

class company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class employe{
    private String name;

        public String getCompany(){
            return company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
