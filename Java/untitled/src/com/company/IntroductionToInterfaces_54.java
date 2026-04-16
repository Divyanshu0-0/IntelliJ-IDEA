//    Interface in java :- An interface in Java is a reference type that defines a contract for classes to implement,
//                     specifying a set of abstract methods and constants without providing their implementation details.


//                       Abstract Classes Vs Interfaces (v :- 55)

package com.company;

import java.util.Scanner;

interface Bicycle{
    int z = 65;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface cycle{

//    Scanner sc = new Scanner(System.in);
//    int z = sc.nextInt();

    int z = 98;
    void Break();
    void speed();
}
class AvonCycle implements Bicycle{
//    int z = 12;
    void BlowHorn(){
        System.out.println("Horn");
    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("Applying Break");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying Boost");
    }
    void Break(){
        System.out.println("not");
    }
    void speed(){
        System.out.println("nothing");
    }
}
public class IntroductionToInterfaces_54 {
    public static void main(String[] args) {
        AvonCycle avon = new AvonCycle();

//      you can create properties in interfaces,
//        avon.applyBreak(1);

//      You can't modify the properties in interfaces as they are final.
//        avon.z = 84; its wrong
//        System.out.println(Bicycle.z);
//        System.out.println(avon.z);
//        System.out.println(avon.b);

        avon.Break();
        avon.speed();
    }
}