package latihan5.constructor;

/*
    Constructor
    - didalam class java, kita bisa membuat constructor, constructor adalah method yang pertama kali dipanggil
      saat pertama kali pembuatan object
    - mirip seperti di method, kita bisa memberi parameter pada constructor
    - nama constructor harus sama dengan nama class, dan tidak membutuhkan kaya kunci void atau return value
 */

//class
class Person {

    //field
    String name;
    String address;
    final String country = "Indonesia";

    //constructor
    Person(String ParamName, String ParamAddress){
        name = ParamName;
        address = ParamAddress;
    }
}
