package day12;
import java.util.Scanner;
public class C01_BMICalculator {
    //Please create method for below the question.
    //Question 2- Ask for the user's weight (kg) and height (cm) (Scanner object)
    // and calculate the body mass index (weight * 10000 / (height * height)) (BMI formula is given)
    // if the body mass index is greater than 30 obese, (1. condition)
    // between 25-30 overweight (2. condition), between 20-25 normal (3. condition),
    // if less than 20 print thin (4. condition).

    public static void main(String[] args) {

        BMICalculator1(); // gets data from user thanks to scanner class object

        BMICalculator2(176, 75); // we are passing the data

    }

    public static void BMICalculator1()  {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your height as cm");
        int height = scan.nextInt();
        System.out.println("Please enter your weight as kg");
        int weight = scan.nextInt();

        int bmi = (weight * 10000) / (height * height);
        System.out.println("BMI :" + bmi);

        if(bmi>=30){
            System.out.println("obese");
        } else if(bmi>=25) {
            System.out.println("overweight");
        } else if(bmi>=20) {
            System.out.println("normal");
        } else {
            System.out.println("thin");
        }


    }


    public static void BMICalculator2(int height, int weight)  {

        int bmi = (weight * 10000) / (height * height);
        System.out.println("BMI :" + bmi);

        if(bmi>=30){
            System.out.println("obese");
        } else if(bmi>=25) {
            System.out.println("overweight");
        } else if(bmi>=20) {
            System.out.println("normal");
        } else {
            System.out.println("thin");
        }


    }
}
