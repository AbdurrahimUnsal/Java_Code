package day03;
import java.util.Scanner;
public class C03_ScannerQuestion {
    public static void main(String[] args) {

        // create a program that saves name and surname of the user then print it on the screen

        //1) Create scanner object

        Scanner scan = new Scanner(System.in);

        //2) Ask user what you want

        System.out.println("Please enter your first and last name");

        //3) to save the data create variable

        String str = scan.nextLine();

        //4) manipulate the data

        System.out.println("user first and last name : " + str.toUpperCase());

        /*
        Question 1- Ask the user for a number, check the number and print “Number a multiple of 5” if it is divisible by 5.
        Question 2- Get a letter from the user, print it if there is a month that starts with a letter.
        NOTE: No uppercase or lowercase sensitivity. When the user types j or J, output is Jan.
         */

        scan.close();

    }
}
