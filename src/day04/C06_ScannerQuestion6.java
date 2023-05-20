package day04;
import java.util.Scanner;
public class C06_ScannerQuestion6 {
    public static void main(String[] args) {

        //Question 6 (Interview)- Take two numbers from the user and change their values (swap).

        Scanner scan = new Scanner(System.in);
        System.out.println("please provide first data");
        String firstText = scan.next();

        System.out.println("please provide second data");
        String secondText = scan.next();

        String tempvariable;

        System.out.println("Before swap " + firstText + "------------" + secondText);

        tempvariable = firstText;
        firstText = secondText;
        secondText = tempvariable;

        System.out.println("After swap " + firstText + "------------" + secondText);

        System.out.println(Byte.MAX_VALUE);


//        int a = 5;
//        int b = 9;
//        int c; // temporary variable
//
//        c = a;
//        a = b;
//        b = c;
//
//        System.out.println("a value: " + a + "  b value: " + b);




    }
}
