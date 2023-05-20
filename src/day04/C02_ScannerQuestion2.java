package day04;
import java.util.Scanner;
public class C02_ScannerQuestion2 {
    //Question 2- Take a double and an int number from the user and print their sum and product.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your double value");
        double numDouble = scan.nextDouble();

        System.out.println("Please enter your integer value");
        int  numInt = scan.nextInt();

        double sumOfNumbers = numDouble + numInt ;
        double productOfNumbers = numDouble * numInt;

        System.out.println("Sum of the numbers : " + sumOfNumbers);
        System.out.println("product of the numbers : " + productOfNumbers);

        scan.close();

    }

}
