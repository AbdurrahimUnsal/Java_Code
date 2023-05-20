package day30_arrayList3;
import java.util.ArrayList;
import java.util.List;
public class C04_Fibonacci {
    // Question 4- Take a given positive integer n,
    // create a method that returns us the first n Fibonacci numbers as a list.

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377


    public static void main(String[] args) {

        System.out.println(fibonacci(10));


    }


    public static List<Integer> fibonacci(int number){

        List<Integer> list = new ArrayList<>();

        if(number == 0){
            System.out.println("Please enter number different than zero");
        } else if (number == 1){
            list.add(0);
        } else if(number == 2) {
            list.add(0);
            list.add(1);
        } else {

            int firstNumber = 0;
            list.add(firstNumber);
            int secondNumber = 1;
            list.add(secondNumber);
            int nextNumber = firstNumber + secondNumber;
            list.add(nextNumber);

            while(list.size()<number){

                firstNumber = secondNumber;
                secondNumber = nextNumber;
                nextNumber = firstNumber + secondNumber;
                list.add(nextNumber);
            }

        }

        return list;
    }
}
