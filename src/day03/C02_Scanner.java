package day03;
import java.util.Scanner;
public class C02_Scanner {
    public static void main(String[] args) {

        //to take data from user you should follow this steps

        //1) Create the scanner object
        Scanner scan = new Scanner(System.in);

        //2)Inform the user about what you want
        System.out.println("Please put your pin number");

        //3) create a variable to store coming data value
        int userPinCode = scan.nextInt();

        //4) to print or manipulate the data
        System.out.println("user pin code : " + (userPinCode + 5));

        scan.close();








    }
}
