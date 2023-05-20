package day15_string_manipulations;
import java.util.Scanner;
public class C03_Question2 {
    //Question 2: Get a String from the user and the text to be searched.
    //Check the usage of the desired text in the String and print the appropriate one of the following sentences.
    //use indexOf()

    //String does not contain the searched text
    //Searched text used only once in the String
    //Searched text used more than 1 in the String

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a string");
        String str1 = scan.nextLine();

        System.out.println("provide another string ");
        String str2 =scan.nextLine();

        if(str1.indexOf(str2)  == (-1)){
            System.out.println("Str1 does not contain str2");
        }else{
            int firstIndexOfMatch = str1.indexOf(str2);
            if(str1.indexOf(str2, firstIndexOfMatch+1) == (-1)){
                System.out.println("Str2 is used only once in str1");
            }else{
                System.out.println("Str2 used more than once in str1");
            }
        }


    }

}
