package day27_ArraysAndMDA;
import java.util.Arrays;
public class C02_BinarySearch {
    public static void main(String[] args) {
        //to find a desired element in an array we use binarySearch() method
        int[] arr = {4,9,1,5,11,3,7};

        System.out.println(Arrays.toString(arr));//[4, 9, 1, 5, 11, 3, 7]

        Arrays.sort(arr); //sorting is must before binarySearch() otherwise you will have undefined values
        System.out.println(Arrays.toString(arr));//[1, 3, 4, 5, 7, 9, 11]



        System.out.println(Arrays.binarySearch(arr, 5));// 3  //if the value is in the array you will have input as the index of the element
        System.out.println(Arrays.binarySearch(arr, 11));// 6
        System.out.println(Arrays.binarySearch(arr, 1));// 0

        System.out.println(Arrays.binarySearch(arr, -4));// -1 //if it is not in the array and smaller then all elements you will get -1

        System.out.println(Arrays.binarySearch(arr, 14));// -8 //if it is not in the array and larger than all elemnents you will get - length

        System.out.println(Arrays.binarySearch(arr, 8));// -6 //if it is not in the array but between smaller and alrgest elements, you will get
        System.out.println(Arrays.binarySearch(arr, 2));// -2 //possible index number
        System.out.println(Arrays.binarySearch(arr, 6));// -5


    }
}
