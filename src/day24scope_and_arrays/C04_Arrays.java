package day24scope_and_arrays;
import java.util.Arrays;
public class C04_Arrays {
    public static void main(String[] args) {

        String str = "John";
        String str2 = "Emily";
        String str3 = "Mike";
        String str4 = "Suzan";

        String[] strArray = {"John", "Emily", "Mike", "Suzan"}; //Array

        System.out.println(Arrays.toString(strArray)); //[John, Emily, Mike, Suzan]

        int[] intArray = {1, 3, 5, 7, 9};
        System.out.println(Arrays.toString(intArray));//[1, 3, 5, 7, 9]

        System.out.println(strArray[0]);//John

        System.out.println(intArray[3]);//7


    }
}
