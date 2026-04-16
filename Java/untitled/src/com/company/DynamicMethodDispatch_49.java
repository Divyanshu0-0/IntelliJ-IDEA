package com.company;

class phone{
    public void name(){
        System.out.println("Good Morning ");
    }
    public void on(){
        System.out.println("Turn on Phone");
    }}
    class SmartPhone extends phone{

    public void Nothing(){
            System.out.println("Nothing");
        }
        public void on(){
            System.out.println("Turn on SmartPhone");
        }}
public class DynamicMethodDispatch_49 {
    public static void main(String[] args) {

//        phone obj = new phone();  //  Object.
//        obj.name();  // we called phone.

//        phone is SuperClass and smartPhone is SubClass

//      1.  obj is a reference to the superclass and may be Equal to Objects of SubClasses but
//          SubClass reference is not Equal to SuperClass Object.

//        SmartPhone obj = new phone();  // this is not allowed
        phone obj = new SmartPhone();  // allow
        obj.name();
        obj.on();

//        obj.nothing(); // this is not allow

//        SmartPhone Smob = new SmartPhone();

    }
}
