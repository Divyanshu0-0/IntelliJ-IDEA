package com.company;

 class Base{
    int x;

    public int getX() {
        return x;
        }

    public void setX(int x) {
        System.out.println("I am in Base and Setting on x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a Constructor");
    }
}
class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Derived");
        this.y = y;
    }
}
public class Inheritance_In_JAVA_45 {
    public static void main(String[] args) {

//      Base b = new Base();     //-----> this is called  Object.
        Derived b = new Derived();

        b.setX(77);
        System.out.println(b.getX());

        b.setY(767832678);
        System.out.println(b.getY());

    }
}
