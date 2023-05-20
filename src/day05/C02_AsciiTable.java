package day05;
import java.util.Scanner;
public class C02_AsciiTable {
    public static void main(String[] args) {

        char myChar = 'A';
        System.out.println(myChar); // A
        System.out.println(myChar + 0); // 65

        //Ask user to provide a word and print next three letters from alphabet after the first letter of the word

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user please enter a word");
        String userWord = scan.next();
        System.out.println(userWord);

        char firstLetter = userWord.charAt(0);

        System.out.println("next there letters : " + (char)(firstLetter+1)+ " " + (char)(firstLetter+2)+ " " + (char)(firstLetter+3));

        //when a char sees a math calculation symbol, it will act like a number
        //to be able print number as a char character we should type cast with (char)


        //*******get the last letter from user provided data and print previous three letters from the alphabet
        //hint: length() for string

        // ali, door, randomtext





    }
}
