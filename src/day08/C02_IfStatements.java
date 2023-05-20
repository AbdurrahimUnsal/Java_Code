package day08;
import java.util.Scanner;
public class C02_IfStatements {
    //Question 2- Get a note from the user, print "Pass the Class" if it is 50 or more, and "Sorry, failed" if it is less than 50.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("hey User! Give  ME A GRADE");

        int num = scan.nextInt();

        if(num >= 50) {
            System.out.println("Pass the Class");
        }

        if(num < 50) {
            System.out.println("Sorry, failed");
        }



    }
}
