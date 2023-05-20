package day35_passbyvalue_immutableclass_date;
import java.util.Arrays;
public class C02_PassByValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int increment = 3;

        increaseElements(arr, increment);//[4, 5, 6]
        System.out.println(Arrays.toString(arr));//[4, 5, 6] looks like original values are changed


    }

    public static void increaseElements(int[] arr, int increment){
        for (int i = 0; i < arr.length; i++) {
            arr[i]  =  arr[i] + increment;
            //arr[i] += increment;
        }
        System.out.println("inside elements increased method array: " + Arrays.toString(arr));
    }
}
