package day21_method_overload;
import java.util.Scanner;
public class C05_WhileLoop {
    public static void main(String[] args) {

        // take a lot of numbers from user
        // as long as sum of these numbers is lower than 500, continue
        // at the end, print how many numbers user entered and sum of numbers

        Scanner scan = new Scanner(System.in);
        int sum =0;
        int enteredNumber =0;
        int numberOfEnteredNumber =0;

        while(sum<=500){

            System.out.println("Please enter a number");
            enteredNumber = scan.nextInt();

            sum = sum + enteredNumber; // sum +=enteredNUmber this is the increment that will end the while loop

            numberOfEnteredNumber++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("number of entered number :" + numberOfEnteredNumber);

    }
}
