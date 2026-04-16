//    Chapter 11. Java Practice Question On Abstract Classes And Interfaces (60)

//  Q 1. Create an Abstract Class pen with methods write() and refill() as Abstract Methods.

package com.company;
/*
abstract class pen {
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    @Override
    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }
    void ChangeNib(){   //  Q 2. Use the pen class from Q1 to create a concrete Class FountainPen with Additional method changeNib().

        System.out.println("Changing Nib");
    }
}
public class QuestionOnAbstractClasses_And_Interfaces {
    public static void main(String[] args) {
        FountainPen f = new FountainPen();
        f.ChangeNib();
        f.refill();
        f.write();
    }
}
 */

/*
//  Q 3. Create a Class Monkey with jump() and Bite() Methods, Create a Class Human which inherits
//  this monkey class and implement BasicAnimal interface with eat() and sleep() method.

 class Monkey {
     void Jump(){
         System.out.println("Jump");
     }
     void Bite(){
         System.out.println("Bite");
     }
}
interface BasicAnimal{
     void eat();
     void sleep();
}
class Human extends Monkey implements BasicAnimal{
     void speak(){
         System.out.println("Hello Monkey");
     }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class QuestionOnAbstractClasses_And_Interfaces {
    public static void main(String[] args) {
        Human h = new Human();
        h.Jump();
        h.Bite();
        h.speak();
        h.eat();
        h.sleep();
    }
}
*/

// Q 5. Demonstrate polymorphism using monkey class from Question-3.

class Monkey {
    void Jump(){
        System.out.println("Jump");
    }
    void Bite(){
        System.out.println("Bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Monkey");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class QuestionOnAbstractClasses_And_Interfaces {
    public static void main(String[] args) {
        Monkey m1 = new Human();

//      m1.speak(); --> Cannot use Speak Method because the reference is Monkey which does not have Speak Method.

        BasicAnimal Mark1 = new Human();

//      Mark1.speak(); --> error

        Mark1.eat();
        Mark1.sleep();
    }
}


