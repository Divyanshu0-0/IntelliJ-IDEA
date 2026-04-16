package com.company;

public class Methods31 {

    //Default type

//    public static void main(String[] args) {
//int a = 11;
//int b = 9;
//int c;
//if (a>b){
//    c = a+b;
//}
//else {
//    c = (a+b)*9;
//}
//int a1 = 4;
//int b1 = 6;
//int c1;
//        if (a1>b1){
//            c1 = a1+b1;
//        }
//        else {
//            c1 = (a1+b1)*9;
//        }
//        System.out.println(c);
//        System.out.println(c1);
//    }
//}


//   Using method.

    static int logic ( int x , int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x+y)*9;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 11;
        int b = 9;
        int c;
        c = logic(a, b);
        int a1 = 4;
        int b1 = 6;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(a +"\n "+ b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
