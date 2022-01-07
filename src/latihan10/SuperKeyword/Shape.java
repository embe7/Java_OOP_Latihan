package latihan10.SuperKeyword;

/**
 * Super Keyword
 * - Kadang kita ingin mengakses method yang ada di class parent yang sudah terlanjur kita override di class child
 * - untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
 * - sederhananya, super digunakan untuk mengakses class parent
 * - tidak hanya method, field milik class parent pun bisa kita akses menggnakan kata kunci super
 */

//class (parent)
class Shape {

    //method
    int getCorner(){
        return 0;
    }
}

//class (child)
class Rectangle extends Shape{

    //method
    int getCorner(){
        return 4;
    }

    //method
    int getParentCorner(){
        return super.getCorner();
    }
}