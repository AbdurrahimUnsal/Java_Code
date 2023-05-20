package day10;
import java.util.Scanner;
public class C04_Ternary {
    public static void main(String[] args) {

        // Question 6- Get a number from the user and print its absolute value

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();

        if(a>=0){
            System.out.println(a);
        } else {
            System.out.println(a*(-1));
        }

        System.out.println(a>=0 ? a : a*(-1)); //ternary operator




    }
}
