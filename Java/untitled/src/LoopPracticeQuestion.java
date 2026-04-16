
// Practice question

import java.util.Scanner;

public class LoopPracticeQuestion {
    public static void main(String[] args) {

        // Q 1. Star pattern

//        ****
//        ***
//        **
//        *


//       int n = 4;
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        // Q2. Write a program to sum first n even numbers using while loop.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter numbers : ");
//        int sum = 0;
//        int n = sc.nextInt();
//        for (int i=0; i<n; i++){
//            sum = sum + (2*i);
//        }
//        System.out.print("Sum of even number is: ");
//        System.out.print(sum);


        // Q3. Write a program to print multiplication table of (n) numbers.


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            System.out.printf("\n %d X %d = %d " ,n , i , n*i );
//        }


        // Q4. Write a program to print multiplication table of 10 in reverse order.


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int n = sc.nextInt();

//        int n = 10;
//        for (int i=10; i>=1; i--){
//            System.out.printf("\n %d X %d = %d " ,n , i , n*i );
//        }


//        Q5. Write a program to find factorial of a given n number using for loop.

//        what is Factorial (n!) = n * n-1 * n-2 ......1
//       Example 5! = 5*4*3*2*1.....


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Digit to find Factorial : ");
//        int n = sc.nextInt();
//        int factorial = 1;
//        for (int i = n; i >= 1; i--) {
//            factorial *= i;
//                System.out.print( factorial);
//            }
//            System.out.print("\n");


        // Q6.  Write a program to find factorial of a given n number using While-loop.

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Digit to find Factorial : ");
//        int n = sc.nextInt();
//        int i =1;
//        int factorial = 1;
//
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);


//         Q7. Star pattern using while loop

//        ****
//        ***
//        **
//        *

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Digit to find Factorial : ");
//        int n = sc.nextInt();
//        int n = 4;
//        int i =0;
//        while (i<n)
//        {
//            int j = 0;
//            while (j<n-i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//            i++;
//        }


//       q.9 Write a program to calculate the sum of the number occurring in the multiplication table of 9.


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a Number : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i=1; i<=10; i++){
//            System.out.printf("\n %d X %d = %d " ,n , i , n*i );
//            sum = sum + (n*i);
//        }
//        System.out.print("\n Sum of even number is: ");
//        System.out.print(sum);

        }

    }

