package day08;
import java.util.Scanner;
public class C08_IfStatements {
    public static void main(String[] args) {

        /*
     Example 1:It takes the age value from the user and determines the age at which stage.
               Generate the code that prints according to the table below
               0-4 ==> baby
               5-12 ==> kid
               13-20 ==> young
               21-30 ==> adult
               over 30 ==> Undefined
               Print "Enter a valid age" as an Error Message
                */

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your age..");
            int age = input.nextInt();

            if(age<0){
                System.out.println("\n" + "Enter a valid age.");
            } else if (age<5) {
                System.out.println("Baby");
            } else if (age<13) {
                System.out.println("Child");
            } else if (age<21) {
                System.out.println("Young");
            } else if (age<31) {
                System.out.println("Adult");
            }else {
                System.out.println("Undefined age...");
            }
        }
}
