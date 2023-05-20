package day04;
import java.sql.SQLOutput;
import java.util.Scanner;
public class C01_ScannerQuestion1 {
    public static void main(String[] args) {

        //Question 1- Get values in three different data types from the user and print the entered values with their explanations.

        //1) Create scanner object
        Scanner scan = new Scanner(System.in);

        //2) Inform the user
        System.out.println("Please enter your name");
        String userName = scan.nextLine();

        System.out.println("Please enter your age");
        byte userAge = scan.nextByte();

        System.out.println("Enter your salary");
        int userSalary = scan.nextInt();

        System.out.println("User name : " + userName + "," + "User age : " + userAge + "," + "User salary : " + userSalary);
        System.out.println("User age : " + userAge);
        System.out.println("User salary : " + userSalary);

        scan.close();






    }
}
