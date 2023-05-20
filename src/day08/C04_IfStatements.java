package day08;
import java.util.Scanner;
public class C04_IfStatements {
    //Question 3- Ask the user's age, print "You can retire" if he is 65 years or older, otherwise print the number of years he has to work to retire.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        int retirementAge = 65;

        if(age>=retirementAge) {
            System.out.println("Hey men. You are retired.");
        }
        if(age<retirementAge) {
            System.out.println( " You need to work " + (retirementAge - age) + " more year.");
        }


        scan.close();
    }

}
