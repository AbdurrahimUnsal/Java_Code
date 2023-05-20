package day18_for_loops;
import java.util.Scanner;
public class C03_For_loops {
    //Question 3- Take positive numbers as starting and ending values from the user,
    // print the sum of all numbers between them, including the borders.
    // If the end value is less than the start value, print a warning and end the process

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter beginning number");
        int startingNumber = scan.nextInt();
        System.out.println("Please provide ending number");
        int endingNumber = scan.nextInt();

        int sum = 0;

        if(endingNumber<startingNumber){
            System.out.println("ending value should be more then start value");
        }else{
            for(int i=startingNumber; i<=endingNumber; i++ ){
                sum = sum+i;
            }
        }

        System.out.println("Total : " + sum);



    }
}
