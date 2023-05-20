package day04;
import java.util.Scanner;
public class C03_ScannerQuestion3 {
    //Question 3- Take the name, surname and age of the user and print them in the format below.
    //	Your name : John
    //	Your last name: Doe
    //	Your age : 44
    //	Your registration has been successfully completed.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user first name");
        String firstName = scan.next();  //while scan.nextline() method gets all the words provided, scan.next() gets only fist letter

        System.out.println("Enter user last name");
        String lastName = scan.next();

        System.out.println("Enter user age");
        String age = scan.next();

        System.out.println("Your name : " + firstName + "\nYour last name : " + lastName + "\nYour age : " + age + "\nYour registration has been successfully completed.");

        // \n helps tp print on next line

        scan.close();



    }
}
