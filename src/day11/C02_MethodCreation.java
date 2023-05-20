package day11;
import java.util.Scanner;
public class C02_MethodCreation {
    //ask user to enter two numbers and create a method to multiply them

    public static void main(String[] args) {

        multiplyNumbers();
        multiplyNumbers();
        multiplyNumbers();

    }

    public static void multiplyNumbers (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt();
        System.out.println("Please enter another number");
        int num2 = scan.nextInt();

        int result = num1*num2;

        System.out.println("Result : " + result);
        System.out.println("End of the execution __________________");


    }

}
