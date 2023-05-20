package day21_method_overload;
import day19_for_loops.C02_For_loops;

import java.util.Scanner;
public class C01_Question1 {
    // use the method from day19 to reverse strings and check if it is a (palindrome madam)
    // take a string from user and check if it is a palindrome

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();

        String reversedStr = C02_For_loops.reverseString(str); // we call the method we created before

        if(str.equals(reversedStr)){
            System.out.println("Yes, the string is palindrome");
        }else {
            System.out.println("No, it is not palindrome");
        }


    }



}
