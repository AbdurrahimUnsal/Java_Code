package day10;
import java.util.Scanner;
public class C02_NestedIfElse {
     /*
    Question 1- Get the gender and age from the user. Female, 60 years old and over,
    Men 65 years and older can retire. Print “You can retire” or
    “You need to work .. more years to retire”, taking into account gender and age.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));
        System.out.println("hey user! Please enter your age");
        int age = scan.nextInt();

        System.out.println("Please enter your gender: Female: F , Male: M");
        char gender = scan.next().charAt(0);

        //Our main focus for this solution is gender

        if(gender == 'F' || gender == 'f'){
            // we will write our code according to Female
            if (age<0 || age>150){
                System.out.println("Invalid age");
            } else if(age<60){
                System.out.println("You need to work " + (60-age) + " more years to retire");
            } else {
                System.out.println("You can retire");
            }
        } else if(gender == 'M' || gender == 'm') {

            if (age<0 || age>150) {
                System.out.println("Invalid age");
            }else if(age<65){
                System.out.println("You need to work " + (65-age) + " more years to retire");
            } else {
                System.out.println("You can retire");
            }
        } else{
            System.out.println("Invalid Gender");
        }





    }
}
