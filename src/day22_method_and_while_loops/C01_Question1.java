package day22_method_and_while_loops;
import java.util.Locale;
import java.util.Scanner;
public class C01_Question1 {
    //Question 2- Get the user's name and surname separately in the main method
    // Create a method that returns:
    // first letters of first and last name as capitals and rest should be in lower case
    // input : name : Ali    surname :YILMAZ
    // output : Ali Yilmaz


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scan.next();

        System.out.println("Please enter your last name");
        String lastName = scan.next();

        System.out.println(nameConverter(firstName,lastName));



    }

    public static String nameConverter(String firstName, String lastName){

        String outPut = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        return outPut;
    }



}
