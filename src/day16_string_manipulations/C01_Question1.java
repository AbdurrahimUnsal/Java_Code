package day16_string_manipulations;
import java.util.Scanner;
public class C01_Question1 {
    //Question 2: Get a String from the user and the text to be searched.
    // Check the usage of the desired text in the String and print the appropriate one of the following sentences

    //String does not contain the searched text
    //Searched text used only once in the String
    //Searched text used more than 1 in the String

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("PLease provide a string");
        String str1 = scan.nextLine();
        System.out.println("PLease provide another string");
        String str2 = scan.nextLine();

        int firstIndex = str1.indexOf(str2);
        int lastIndex =str1.lastIndexOf(str2);

        if (firstIndex == -1){
            System.out.println("String does not contain the searched text");
        } else if(firstIndex == lastIndex){
            System.out.println("Searched text used only once in the String");
        }else {
            System.out.println("Searched text used more than 1 in the String");
        }

    }

}
