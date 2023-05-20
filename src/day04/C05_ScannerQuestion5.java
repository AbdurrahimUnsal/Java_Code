package day04;
import java.util.Scanner;
public class C05_ScannerQuestion5 {
    //Question 5- Take the name, surname and age of the user and print them in the format below.
    //data provided John doe 44
    //	information entered : J DOE, 44

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name");
        char firstNameInitial = scan.next().charAt(0);
        System.out.println("Please enter your last name");
        String lastName = scan.next().toUpperCase();
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        System.out.println("information entered : " + firstNameInitial + " " + lastName + ", " + age);

        System.out.println(lastName.charAt(2)); // all string indexes start from zero

        scan.close();


    }
}
