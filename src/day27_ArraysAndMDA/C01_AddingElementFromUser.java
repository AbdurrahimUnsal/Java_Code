package day27_ArraysAndMDA;
import day26_arrays2.C04_AddingElementsWithMethod;

import java.util.Arrays;
import java.util.Scanner;
public class C01_AddingElementFromUser {
    public static void main(String[] args) {
        //Get numbers from user and add them to an array
        //when user pres 0, print the array

        Scanner scan = new Scanner(System.in);

        int enteredNumber = 1 ;
        int[] arr = new int[0];

        while(enteredNumber != 0){
            System.out.println("please enter a number to add to the array or enter 0 to print the array");
            enteredNumber = scan.nextInt();

            if(enteredNumber!=0){
                arr = C04_AddingElementsWithMethod.addingNewElement(arr, enteredNumber);
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
