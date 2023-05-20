package day12;
import java.util.Scanner;
public class C04_SwitchStatements {
    //Question 6- Get the month number from the user and print the season.

    public static void main(String[] args) {

        seasonPicker();

    }

    public static void seasonPicker(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1-12");
        int monthNumber = scan.nextInt();

        switch (monthNumber) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Fall");
                break;

            default :
                System.out.println("Invalid number");
                break;
        }
    }
}
