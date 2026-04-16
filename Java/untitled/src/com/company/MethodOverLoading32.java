package com.company;

public class MethodOverLoading32 {

//    static void change(int a) {
//        a = 898;
//    }
    static void foo(){
        System.out.println("Hello ");
    }
    static void foo(int a, int b ){
        System.out.println("Hello " + a +" "+ b + " bro ");
    }
     int a = 27;
    static void change(int [] arr) {
        arr[2] = 898;
    }
    public static void main(String[] args) {
//        int [] arr = { 21, 34, 56, 46, 87};
//        Case 1. Changing the integer
//        int x = 89;
//        change(x);
//        System.out.print(" The value of X running after change is : " + x);

//        Case 2. Changing the Array
        int [] marks = { 21, 34, 56, 46, 87};
        change(marks);
        System.out.print(" The value of X running after change is : " + marks[2]);

        foo();
        foo(5765 , 8900);

    }
}
