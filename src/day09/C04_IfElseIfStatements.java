package day09;
import java.util.Scanner;
public class C04_IfElseIfStatements {
    //Question 2- Ask for the user's weight (kg) and height (cm)
    // and calculate the body mass index (weight * 10000 / (height * height))
    // if the body mass index is greater than 30 obese,
    // between 25-30 overweight, between 20-25 normal,
    // if less than 20 print thin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your weight as kg");
        int weight = scan.nextInt();
        System.out.println("Please enter your height as cm");
        int height = scan.nextInt();

        int bmiRatio = weight * 10000 / (height * height);

        if (bmiRatio>=30) {
            System.out.println("obese");
        }else if (bmiRatio>=25){
            System.out.println("overweight");
        }else if (bmiRatio>=20){
            System.out.println("normal");
        }else {
            System.out.println("thin");
        }

        /*
        Question 3- Get the number of products purchased from the user
        and the list price,
        and ask the user if they have a customer card.
        If the customer has a card and buys more than 10 items, 20% off, otherwise 15% off.
    	If the customer does not have a card, 15% off if he buys more than 10 products, 10% off if he does not
         */


    }
}
