package day19_for_loops;
import java.util.Scanner;
public class C03_For_loops {
    //Question 7- Get a positive integer from the user and print the sum of the digits.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();

        int sum = 0 ;

        for(int i=num; i!=0; i= i/10){

            int lastDigit = i%10;

            sum = sum + lastDigit;

        }

        System.out.println(sum);



        //2.Way

        for(; num != 0; num /= 10) {

            sum = sum + (num % 10);

        }

        System.out.println(sum);



    }
}
