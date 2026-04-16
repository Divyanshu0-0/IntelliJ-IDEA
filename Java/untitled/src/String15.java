import java.util.Locale;
import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {

        //Problem 1. Write a Program to convert a string to lowerCase.

        String lcase = "NaMe";
        lcase = lcase.toLowerCase();
        System.out.println(lcase);
        lcase = lcase.toUpperCase();
        System.out.println(lcase);

        // Problem 2. Write a Program to replace Space with UnderScore.

        //Solve 1.
        String text = "I  am  Harry";
        text = text.replace(" ","_");
        System.out.println(text);

        //Solve 2.
        String space = "        Space      ";
        System.out.println(space.replace(" ","_"));

        //Problem 3.
       String letter = "Dear <|Name|> , Thanks a lot ";
       letter = letter.replace("<|Name|>","Dev");
       System.out.println(letter);

    // Problem 4. Write a java program to detect double and triple space in a String.

    String detect = " This String containt  double and triple Spaces";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   "));
//      when output is -1 then space is not detact.

        // Problem 5. write a program to formate the following letters using escape sequence characters.
        String letter1 = " Dear Harry, \n  This is Good,\n  Thanks ! ";
        System.out.println(letter1);


        

    }
}
