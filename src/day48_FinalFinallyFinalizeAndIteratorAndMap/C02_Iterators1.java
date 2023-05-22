package day48_FinalFinallyFinalizeAndIteratorAndMap;
import java.util.Arrays;
public class C02_Iterators1 {
    public static void main(String[] args) {

        int [] arr = {3,4,6,8,4,2,12};

        //print all elements of the arr

        for (int each:arr) {
            System.out.print(each+ " ");
        }

        System.out.println();
        System.out.println("============");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        System.out.println("============");

        /*
        Without using index structure please add 3 to all elements
         */

        for (int each: arr){
            each = each+3;
            System.out.print(each+ " ");
        }

        System.out.println();
        System.out.println("============");

        System.out.println(Arrays.toString(arr));

           /*
        by using for each loop, even we do not use index, we can print all elements, but we can not change them
         */




    }
}
