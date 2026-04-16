package com.company;

import java.util.Scanner;

public class Recursion34 {
        static int factorial (int n){
//        Factorial
            if (n==0 || n==1){
                return 1;
            }
            else {
                return n * factorial(n-1);
            }
        }
    static int factorial_iterative (int n){
//        Factorial
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n;i++){
                product*= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit to change in factorial : ");
            int n = sc.nextInt();
        System.out.println("The value of (n) factorial is " + factorial(n));
        System.out.println("The value of (n) factorial_iterative is " + factorial_iterative(n));

    }


}
