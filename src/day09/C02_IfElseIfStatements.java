package day09;
import java.util.Scanner;
public class C02_IfElseIfStatements {
    //If the student's grade is 85 and above, AA,
    //(if not 85 and above) BB if 65 and above,
    //(Not 65 and above) CC if 50 and above,
    //(the rest) DD
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = scan.nextInt();

        if(grade>=85){
            System.out.println("AA");
        }else if(grade>=65) {
            System.out.println("BB");
        }else if(grade>=50){
            System.out.println("CC");
        }else if(grade>=0) {
            System.out.println("DD");
        } else{
            System.out.println("Hey user! Please enter a positive number");
        }

    }
}
