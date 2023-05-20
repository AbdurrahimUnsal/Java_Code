package day26_arrays2;
import java.util.Arrays;
public class C05_AddingElementWithMethod2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};

        arr = C04_AddingElementsWithMethod.addingNewElement(arr, 12);
        System.out.println(Arrays.toString(arr)); //[1, 2, 4, 5, 6, 12]
    }
}
