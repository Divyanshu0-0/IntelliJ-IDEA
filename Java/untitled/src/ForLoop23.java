

//                                  INCREMENT-LOOP

import java.util.Scanner;

public class ForLoop23 {
    public static void main(String[] args) {

        for (int i=0; i<=100000; i++){
            System.out.print(" \nHey " + i);
        }


//        for (int i=1; i<112; i++){
//            System.out.println(i); }
        // Problem 1.Write a program to print n natural number using do-while loop.

//        Formula :

//       2n = Even Numbers = 0 ,2 ,4 ,6 ,8

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number : ");
//        int a = sc.nextInt();

//        int a = 10;
//        for (int e=0; e<=a; e++){
//            System.out.println(2*e);
//        }

//       2n+1 = Odd Numbers = 1 ,3 ,5 ,7 ,9

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number : ");
//        int b = sc.nextInt();

//        int b = 100;
//        for (int o=0; o<=b; o++){
//            System.out.println(2*o+1);
//        }


//                              DECREMENT-LOOP (FOR-LOOP)

//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter digit : ");
//        int a = sc.nextInt();
//        for (int i=a; i!=0; i--){
//            System.out.println(i);
//        }
//
//
//                 OR
//
//        for (int i=91; i!=0; i--){
//            System.out.print(i +" ");
//        }
//                 OR
//
//        for (int i=9; i>=0; i--){
//            System.out.println(i + "  ");
//        }

//  Quick Quiz 1. write a program to print first n natural numbers in order.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit : ");
        int a = sc.nextInt();
        for (int i=a; i>=1; i--){
            System.out.println(i);
        }

    }
}
