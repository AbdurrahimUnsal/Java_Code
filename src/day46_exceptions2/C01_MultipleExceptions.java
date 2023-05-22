package day46_exceptions2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class C01_MultipleExceptions {

    public static void main(String[] args) {

        String str = "Java is getting better everyday";
        int[] arr = {3, 4, 5, 4, 3, 2, 3, 4};

        /*
        ask a number from user to print index value from arr and str of that number
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");

        int index = 0;

        /*
        3. Way: we can use one try-catch for multiple exception
                we need to use a bigger exception
         */
        try {
            index = scan.nextInt();//InputMismatchException
            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
            System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("An exception is encountered");
        }

        /*
        2. Way: We can use as many catch as we need for one try
         */

//        try {
//            index = scan.nextInt();//InputMismatchException
//            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
//            System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter a number");
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Please enter a number in the borders of str");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Please enter a  number in borders of array");
//        }



        /*
        1. Way : We can use try catch for each possible exception
         */

//        try {
//            index = scan.nextInt();//InputMismatchException
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter a number");
//        }
//
//        try {
//            System.out.println(str.charAt(index));//StringIndexOutOfBoundsException
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("Please enter a number in the borders of str");
//            index = scan.nextInt();
//        }
//
//        try {
//            System.out.println(arr[index]); //ArrayIndexOutOfBoundsException
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Please enter a  number in borders of array");
//            index = scan.nextInt();
//        }

    }






}
