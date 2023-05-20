package day10;
import java.util.Scanner;
public class C08_Ternary {
    public static void main(String[] args) {
        // Question 5- Get two numbers from the user and print the smaller number

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        //1.Way
        System.out.println(num1<num2 ? num1 : num2);

        //2.Way

        int smallNum = num1<num2 ? num1 : num2; // I assigned the result of ternary since both were same data type

        System.out.println(smallNum);





    }
}
