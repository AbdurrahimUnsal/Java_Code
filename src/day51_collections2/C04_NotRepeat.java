package day51_collections2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C04_NotRepeat {
    public static void main(String[] args) {

        // if we don't want to see any repeated elements in the array how can we do that
        // hint : use a set

        int [] arr = {3,4,5,3,2,3,4,5,2,3,4,5,2,3,4,5,3,2,4,3,2,4,3,5,3,4,2,3,4};
       

        Set<Integer> uniqueElements = new HashSet<>();

        for (int each : arr){
            uniqueElements.add(each);

        }
        System.out.println(uniqueElements);//[2, 3, 4, 5]
        System.out.println(Arrays.toString(arr));//[3, 4, 5, 3, 2, 3, 4, 5, 2, 3, 4, 5, 2, 3, 4, 5, 3, 2, 4, 3, 2, 4, 3, 5, 3, 4, 2, 3, 4]

        //Let's use hashSet uniqueElements to create an array to add index structure

        arr = new int[uniqueElements.size()];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]
        int index = 0;

        for (int each:uniqueElements){

            arr[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr));//[2, 3, 4, 5]



        }
}
