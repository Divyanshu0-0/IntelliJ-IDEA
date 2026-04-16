package com.company;

class Circle{
    public int radius;

    Circle(){
        System.out.print("\n I'm Clone");
    }
    Circle(int r){
        System.out.println("\n I am circle parameterized Constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r , int h){                             //  make Constructor
        super(r);
        System.out.println("I am Cylinder parameterized Constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Chapter10_PracticeSets_52 {
    public static void main(String[] args) {
        
//        Circle obj = new Circle();             // make Object

          Circle objC = new Circle(4);        // make Object

//        Cylinder obj = new Cylinder();        // make Object
    }
}
