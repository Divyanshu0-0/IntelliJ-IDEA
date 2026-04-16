package com.company;

class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){  //  Overloaded Constructor
        System.out.println("I am an Overloaded Constructor with value of x as: " + x);
    }
}


class Derived1 extends Base1{
    Derived1(){
//        super(1000);
        System.out.println("I am a Derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an Overloaded Constructor of Derived with value of y as: " + y);
    }
}


class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child class of Derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an Overloaded Constructor of Derived with value of z as: " + z);
    }
}


public class Constructor_In_Inheritance_in_Java_46 {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Base1 b = new Base1(1);

//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(62,22);

//        ChildOfDerived c = new ChildOfDerived();
        ChildOfDerived c = new ChildOfDerived(1,2,3);
    }
}
