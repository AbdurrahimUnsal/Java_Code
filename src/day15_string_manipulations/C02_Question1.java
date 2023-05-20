package day15_string_manipulations;
import java.util.Scanner;
public class C02_Question1 {
    //Question 1: Get a String from the user and the text to be searched.
    // Print whether the String contains the desired text using the indexOf( ) method.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a string string");
        String str1 = scan.nextLine();

        System.out.println("provide another string ");
        String str2 =scan.nextLine();

        //1. way
        if(str1.indexOf(str2) != -1){
            System.out.println("Str1 contains str2");
        }else{
            System.out.println("Str1 does not contain str2");
        }

        //2. Way
        if(str1.indexOf(str2) == -1){
            System.out.println("Str1 does not contain str2");
        }else{
            System.out.println("Str1 contains str2");
        }

        //we should learn about the methods
        // 1) how many parameters
        // 2) parameter types
        // 3) return types








    }
}
