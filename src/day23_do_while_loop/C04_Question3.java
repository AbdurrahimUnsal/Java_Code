package day23_do_while_loop;
import java.util.Scanner;
public class C04_Question3 {
    /*
    Ask user to enter an integer.
         If the integer is less than 100, tell user “Won!”
         Otherwise tell user “Lost!”
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0;

        do{
            System.out.println("Please enter a number to win");
            num = scan.nextInt();

            if(num<100){
                System.out.println("You, won!");
            }
        }while(num<100);

        System.out.println("You, lost");

    }
}
