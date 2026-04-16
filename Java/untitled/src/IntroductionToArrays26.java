// Chapter 5. Arrays


import com.sun.source.tree.BinaryTree;

public class IntroductionToArrays26 {
    public static void main(String[] args) {

//   # There are three main ways to create an array in java.

//   1. Declaration and memory allocation

//        int [] marks = new int[9];
//        float [] marks = new float[8];

//   2. Declaration and then memory allocation

//        int [] marks;
//        marks = new int[6];
//        // Initialization
//        marks [0] = 8;
//        marks [1] = 2;
//        marks [2] = 4;
//        marks [3] = 6;
//        marks [4] = 8;
//        marks [4] = 9708; // this is called overriding.

//   3. Declaration, memory allocation and Initialization together.

        int [] marks = { 94 , 345, 35, 35, 54 , 675};

//        marks [13] = 46; // through an error
        System.out.println(marks[1]);

//        Arrays indexes starts from 0 to goes till (n-1) where n is the size of arrays.

    }
}
