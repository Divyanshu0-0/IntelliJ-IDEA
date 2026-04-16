package com.company;

public class VariableArguments_VarArgs_33 {

//    static int sum( int a, int b){
//        return a+b;
//    }
//    static int sum( int a, int c, int b){
//        return a+b+c;
//    }


//                 OR

    static int sum(int ...arr){
    int result = 0;
    for (int a: arr){
        result +=a;
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs Tutorial ");
        System.out.println("The sum of 9 and 6 are : " + sum( 9,6));
        System.out.println("The sum of 9 , 7 and 6 are : " + sum( 9, 7 , 6));
    }
}
