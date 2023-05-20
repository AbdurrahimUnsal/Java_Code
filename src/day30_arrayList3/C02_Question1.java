package day30_arrayList3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C02_Question1 {
    //Question 6- Create a method that takes a positive integer from the user
    // and returns all positive integers that can divide that integer to us as a list.


    public static List<Integer> positiveDividers(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int number = scan.nextInt();

        List<Integer> dividers = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if(number%i == 0){
                dividers.add(i);
            }
        }

        return dividers;
    }

    public static List<Integer> positiveDividers(int number){

        List<Integer> dividers = new ArrayList<>();

        for (int i = 1; i <= number; i++) { //when we try to divide number by 0 we will get aritmetic exception
            if(number%i == 0){
                dividers.add(i);
            }
        }

        return dividers;
    }

    public static void main(String[] args) {

        System.out.println(positiveDividers()); //No parameter is needed because it is coming from user
        System.out.println(positiveDividers(20));

    }


}
