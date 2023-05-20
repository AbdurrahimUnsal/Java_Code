package day10;
import java.util.Scanner;
public class C05_Ternary {
    // take a positive number from user
    // if it is an even number, print "even number"
    // if it is not print "odd number"
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int num = scan.nextInt();

        if(num%2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("odd number");
        }

        System.out.println(num%2 == 0 ? "Even number" : "odd number"); //Ternary



    }
}
