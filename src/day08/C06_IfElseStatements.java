package day08;
import java.util.Scanner;
public class C06_IfElseStatements {
    //Question 5- Ask the user for a letter, if the entered character is Uppercase, print it in uppercase, otherwise print the entered letter

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("hey user! Please enter a character");
        char chr = scan.nextLine().charAt(0);

        if(chr >= 65 && chr <= 90){
            System.out.println("Yes, It is an uppercase character");
        }else {
            System.out.println("It is not uppercase");
        }

        // System.out.println(chr+0);  this is how you can see the numeric value of a char

        /*
        Needs little bit improvement but it ios a good logic
        String word = scan.next();
        word.charAt(0);
        if(word == word.toUpperCase()) {
        System.out.println("It's uppercase.");
        }
        else {System.out.println("It's lowercase."); }
         */

        // Question 5- Ask the user for a letter,
        // if the entered character is lowercase (97-122), print it in uppercase,
        // otherwise print the entered letter

    }
}
