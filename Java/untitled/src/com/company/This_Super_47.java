package com.company;

class ClassA{
    int a;
//    int a = 62;

    public int getA() {
        return a;
    }
    ClassA(int v){
        this.a = v;  // this is a way for us to reference an object of the class which is being created referenced.
    }
    public int returnOne(){
        return 1;
    }
}
class ClassB extends ClassA{
    ClassB(int b){
        super(b);  // A reference variable used to refer immediate parents class object.
        System.out.println("I am a Constructor");
    }
}
public class This_Super_47 {
    public static void main(String[] args) {
        ClassA A = new ClassA(58);
        ClassB B = new ClassB(655);
        System.out.println(A.getA());
    }
}
