import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor_Game {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 0 for :- Rocks \n Enter 1 for :- Paper \n Enter 2 for :- Scissor ");
        System.out.print("Enter your Choice : ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

//        System.out.println("Computer Choice : + computerInput ");

        if (computerInput == 0){
            System.out.println("Computer choice 0 : Rock");
        }
        if (computerInput == 1){
            System.out.println("Computer choice 1 : paper");
        }
        if (computerInput == 2){
            System.out.println("Computer choice 2 : Scissor");
        }
        if (userInput == computerInput){
            System.out.println("Match Draw");
        }
        else if (userInput == 0 &&  computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("you win");
        }
        else {
            System.out.println("Computer Win");
        }
    }
}

