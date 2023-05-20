package day12;
import java.util.Scanner;
public class C02_SwitchStatements {
    // ask a letter from user
    // print days staring with the letter
    // if user enters invalid data, print invalid letter
    // Monday Tuesday Wednesday Thursday Friday Saturday Sunday

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("hey User! Please provide a letter");
        char letter = scan.next().charAt(0);
        letter = Character.toUpperCase(letter);

        if(letter == 'M'){
            System.out.println("Monday");
        } else if(letter == 'T') {
            System.out.println("Tuesday and Thursday");
        } else if(letter == 'W') {
            System.out.println("Wednesday");
        } else if(letter == 'F') {
            System.out.println("Friday");

        }else if (letter == 'S') {
            System.out.println("Saturday and Sunday");
        } else {
            System.out.println("Invalid letter");
        }


        switch (letter) {
            case 'M' : System.out.println("Monday");
                break;
            case 'T' : System.out.println("Tuesday and Thursday");
                break;
            case 'W' : System.out.println("Wednesday");
                break;
            case 'F' : System.out.println("Friday");
                break;
            case 'S' : System.out.println("Saturday and Sunday");
                break;
            default  : System.out.println("Invalid letter");

        }

        /*
        Switch statement is used when you have too many else if
        It is faster
        If you want execution to stop, you should use break. Otherwise, java will continue to run switch statement until finds a break or to the end
        using default at the end will cover for all other cases like else for if statements
         */


        scan.close();
    }

}
