package day06;
import java.util.Scanner;
public class C02_QuestionSumOfDigits {
    //Question 1- Let's take a positive 4-digit integer from the user and find the sum of the digits

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! Please enter 4 digit number");
        int number = scan.nextInt();
        System.out.println("User provided number: " + number);

        //Assume that user provided 1234
        int sum = number%10; //4
        number = number/10; //123
        System.out.println(sum);
        System.out.println(number);


        sum = sum + number%10;//7
        number = number/10;//12
        System.out.println(sum);
        System.out.println(number);

        sum = sum + number%10;//9
        number = number/10;//1
        System.out.println(sum);
        System.out.println(number);//1


        sum = sum + number;

        System.out.println("Sum of the digits: " + sum);//10


    }
}
