package day25_arrays;
import java.util.Arrays;
public class C01_PrintingArrays {
    public static void main(String[] args) {


        int[] intArray = {3,5,67,6,8,3,5,7,9,4};

        System.out.println(intArray); //[I@27f674d I cannot directly print an array

        System.out.println(Arrays.toString(intArray));// [3, 5, 67, 6, 8, 3, 5, 7, 9, 4] Arrays.toString() method helps to print an Array

        System.out.println(intArray[2]);//67

        for (int i = 0; i<=intArray.length-1; i++){ // 3 5 67 6 8 3 5 7 9 4  print all elements one by one
            System.out.print(intArray[i] + " ");
        }




    }
}
