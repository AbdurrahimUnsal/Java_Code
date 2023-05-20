package day11;
import java.util.Scanner;
public class C04_MethodCreation {
       /*
    Note: Create a method for this problem
    Question 1- Get the gender and age from the user. Female, 60 years old and over,
    Men 65 years and older can retire. Print “You can retire” or
    “You need to work .. more years to retire”, taking into account gender and age.
     */

    public static void main(String[] args) {

        retirementCalculator("Male", 60);
    }

    public static void retirementCalculator(String gender, int age){


        char genderIntial = gender.charAt(0);

        if(genderIntial == 'F' || genderIntial == 'f'){
            // we will write our code according to Female
            if (age<0 || age>150){
                System.out.println("Invalid age");
            } else if(age<60){
                System.out.println("You need to work " + (60-age) + " more years to retire");
            } else {
                System.out.println("You can retire");
            }
        } else if(genderIntial == 'M' || genderIntial == 'm') {

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
