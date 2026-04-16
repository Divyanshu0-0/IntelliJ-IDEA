package com.company;

/*
     // Create a class Game , which allows a user to play "Guess the Number".

     1.Constructor to generate the random Number.
     2.takeUserInput() to take a user input of number
     3.isCorrectNumber() to detect whether the number entered by the user is true
     4.getter and setter for no.of Guesses

    #1. use Properties such as noOfGuesses(int), etc to gate this task done!

        Solution in video no. 50     */

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Game(){
        Random ran = new Random();
        this.number = ran.nextInt(13);
        System.out.println("\n       Welcome to guess the number Game\n");
    }
    void takeUserInput(){
        System.out.print("Guess the Number Between 0 to 13 : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    Boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you Guess Correct,\nits was :- %d\nYou Guess it in :- %d attempts " , number, noOfGuesses);
            return true;
        }
        else if (inputNumber<number) {
            System.out.println("Number is to low..");
        }
        else if (inputNumber>number) {
            System.out.println("Number is to high..");
        }
        return false;
    }
}

public class Exercise_3_43 {
    public static void main(String[] args) {

        Game g = new Game();

//      # the program will be run only once.

//        g.takeUserInput();
//        boolean b = g.isCorrectNumber();
//        System.out.println(b);

//     # The program will run repeatedly (because of the while loop).

        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
