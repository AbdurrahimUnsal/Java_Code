package day45_exceptions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_TryCatch2 {






    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int enteredNumber = 0;
        int sum = 0;

        do {
            try {
                System.out.println("Please enter a number to calculate , or press Q to end the loop");
                enteredNumber = scan.nextInt();//if  we try to store a data type different from integer java is going to throw an InputMismatchException
                sum = sum + enteredNumber;
            } catch (InputMismatchException e) {
                char input = scan.next().charAt(0);
               if (input=='q' || input =='Q'){
                   System.out.println("sum of the numbers: " +sum);
                   break;// break from the loop
               }else {
                   System.out.println("Invalid input");
               }
            }
        }while (true);
    }
}
