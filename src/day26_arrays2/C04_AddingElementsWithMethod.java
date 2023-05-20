package day26_arrays2;
import java.util.Arrays;
public class C04_AddingElementsWithMethod {
    public static void main(String[] args) {

        int[] testArray = {5,67,89,12,4};
        int valueToAdd = 100;

        testArray = addingNewElement(testArray, valueToAdd);
        testArray = addingNewElement(testArray, 34);
        testArray = addingNewElement(testArray, 35);
        testArray = addingNewElement(testArray, 46);
        testArray = addingNewElement(testArray, (int)(Math.random()*100)); //add random numbers

        System.out.println(Arrays.toString(testArray));//[5, 67, 89, 12, 4, 100]

    }

    public static int[] addingNewElement(int[] intArr, int valueToAdd){

        int[] newArr = new int[intArr.length+1];

        for(int i=0; i<=intArr.length-1; i++){ //adding the old elements
            newArr[i] = intArr[i];
        }
        newArr[newArr.length-1] = valueToAdd;//adding the extra element

        intArr = newArr;//make the re-assignment to update initial array

        return intArr;
    }
}
