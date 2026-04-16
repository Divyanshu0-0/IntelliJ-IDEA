package com.company;

public class ForEachLoop27 {
    public static void main(String[] args) {

/*
        System.out.println(mark[3]);
        int [] mark = {23, 34, 42, 24, 56, 968};
        System.out.print("Int Type : " + mark.length ); // to know the size of Array
        System.out.print(" and " + mark[3] +"\n");

        float [] mars = {23.2f, 34, 42, 24, 56, 968};
        System.out.print("Float Type : " +mars[0]+"\n");

        String [] Studs = {"Honey", "Money", "Sunny", "Bunny"};
        System.out.print("String Type : " +Studs[2]+"\n");
        System.out.print("String Length is : " + Studs.length);
*/


        int [] mark = {23, 34, 42, 24, 56, 968};

        // Displaying the Array (Native/Simple Way)
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);
        System.out.println(mark[5]);

        // Displaying the Array Using (for loop)
        System.out.println("Printing using For-Loop ");
        for (int i = 0; i< mark.length; i++){
            System.out.println(mark[i]);
        }


    }
}

