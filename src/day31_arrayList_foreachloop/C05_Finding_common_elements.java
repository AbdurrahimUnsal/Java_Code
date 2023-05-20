package day31_arrayList_foreachloop;
import java.util.ArrayList;
import java.util.List;
public class C05_Finding_common_elements {
    // Question 5- Write a program that compares the elements of the two given arrays
    // and returns the elements common to both of them as a separate list.
    // use for each
    public static void main(String[] args) {

        int[] arr1 = {2,3,6,7};
        int[] arr2 = {3,9,6,3};

        commonElements(arr1, arr2);



    }

    public static void commonElements(int[] arr1, int[] arr2) {

        List<Integer> commonList = new ArrayList<>(); // []

        for( int each1 : arr1){
            for(int each2 : arr2){
                if(each1 == each2 && !commonList.contains(each1)){
                    commonList.add(each1);
                }
            }
        }

        System.out.println(commonList);

    }

    //HW: overload this method for string data type
}
