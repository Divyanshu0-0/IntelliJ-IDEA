/*
    # What does abstract (class) means :- existing in thought or as an idea without concrete existence.
    # Abstract Methods :- A method that is declared without an implementation
                       abstract void move to (double x, double y).
    # Abstract Class :- if a class include abstract methods, then the class itself must be declared abstract, as in.

  Example :-     public abstract class GraphicObject {
                 // declare fields
                 // declare non-abstract methods
                 abstract void draw();
                 }                                                                                           */

package com.company;

abstract class Base2{
    public Base2(){
        System.out.println("I'm a Constructor of Base2");
    }

    public void SayHi(){
        System.out.println("Hii");
    }

    abstract public void nemo();
}

class Base0 extends Base2{
    @Override
    public void nemo() {
        System.out.println("Good Morning");
    }
}
//  class Base01 extends Base2    :- without Abstract Didn't Work.

    abstract class Base01 extends Base2{
        public void mem() {
        System.out.println("Third class");
    }
}
public class AbstractClasses_Interfaces_53 {
    public static void main(String[] args) {

//       it is not possible to create an object of an abstract class.
//        Base2 B = new Base2(); // Not Possible because of Abstract Class (Abstract class is not a real class ).
//        Base01 b0 = new Base01(); // and this also.

        Base0 b = new Base0();
    }
}