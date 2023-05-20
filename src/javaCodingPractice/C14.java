package javaCodingPractice;
import java.util.Arrays;
public class C14 {
    public static void main(String[] args) {
    /*
    Write a return method that can sort an int array in Ascending order without using the sort
    method of the Arrays class:
    */
        int[] array = {9, 5, 2, 7, 1};
        int[] sortedArray = sortArray(array);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
    public static int[] sortArray(int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
