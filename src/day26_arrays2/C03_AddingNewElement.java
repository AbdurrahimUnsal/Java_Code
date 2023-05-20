package day26_arrays2;
import java.util.Arrays;
public class C03_AddingNewElement {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        int valueToAdd = 10;

        int[] newArr = new int[arr.length+1];

        for(int i=0; i<=arr.length-1; i++){ //adding the old elements
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = valueToAdd;//adding the extra element

        arr = newArr;//make the re-assignment to update initial array

        System.out.println(Arrays.toString(arr));//[4, 5, 6, 10]


        //Add two more elements arr = {4,5,6,10}

        int valueToAdd2 = 25;
        int valueToAdd3 = 100;

        int[] newArray2 = new int[arr.length+2];

        for(int i=0; i<=arr.length-1; i++){

            newArray2[i] = arr[i];
        }

        newArray2[newArray2.length-1] = valueToAdd3;
        newArray2[newArray2.length-1-1] = valueToAdd2;

        arr = newArray2;

        System.out.println(Arrays.toString(arr));//[4, 5, 6, 10, 25, 100]

    }

    //Homework: Add two Arrays to each other

}
