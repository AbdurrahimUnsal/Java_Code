package day10;
import java.util.Scanner;
public class C07_Ternary {
    //Question 3- Ask the user for a letter,
    // if the entered character is lowercase,
    // print it in uppercase, otherwise print the entered letter

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter = scan.next().charAt(0);

        // 1. way
        System.out.println(Character.isLowerCase(letter) ? Character.toUpperCase(letter) : letter);

        //2.Way
        // you can use ascii table


    }

}
