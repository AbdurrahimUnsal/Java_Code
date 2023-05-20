package day18_for_loops;
import java.util.Scanner;
public class C04_For_loops {
    //Question 5- Take a number less than 20 from the user and calculate the factorial value of this number.

    public static void main(String[] args) {
        findFactorial();

    }

    //created a method
    public static void findFactorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("provide an int between 1-20");
        int givenNumber = scan.nextInt();

        long factorial = 1;

        for (int i=1; i<=givenNumber; i++){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}
