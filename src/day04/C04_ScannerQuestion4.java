package day04;
import java.util.Scanner;
public class C04_ScannerQuestion4 {
    //Question 4- Take the length of 2 sides of a rectangle from the user
    // and print the area of the rectangle (sides: a and b, area = a*b)
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the width of rectangle");
        double width = scan.nextDouble();

        System.out.println("please enter the length of rectangle");
        double length= scan.nextDouble();

        double areaOfRectangle = width*length;

        System.out.println(areaOfRectangle);

        scan.close();



    }
}
