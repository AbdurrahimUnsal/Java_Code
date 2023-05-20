package day31_arrayList_foreachloop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C01_TurningArrayToArrayList {
    public static void main(String[] args) {

        Integer[] arr = {3,4,5,6,4,3,5,4,6,5,4,3,4,5,6,4,5,3,4,5,6,5,4};

        //copy all these elements to an array list

        //1) Using for loop
        List<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);//[]
        System.out.println(numbers.isEmpty());//true

        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }

        System.out.println(numbers);//[3, 4, 5, 6, 4, 3, 5, 4, 6, 5, 4, 3, 4, 5, 6, 4, 5, 3, 4, 5, 6, 5, 4]

        //2) Using asList()
        List<Integer> listFromArray = Arrays.asList(arr); //When we use asList() method we cannot add or remove elements. We will get UnsupportedOperationException
        System.out.println(listFromArray);//[3, 4, 5, 6, 4, 3, 5, 4, 6, 5, 4, 3, 4, 5, 6, 4, 5, 3, 4, 5, 6, 5, 4]

        numbers.add(11);
        System.out.println(numbers);//[3, 4, 5, 6, 4, 3, 5, 4, 6, 5, 4, 3, 4, 5, 6, 4, 5, 3, 4, 5, 6, 5, 4, 11]

//        listFromArray.add(11);
//        System.out.println(listFromArray); //UnsupportedOperationException

        numbers.remove(0);
        System.out.println(numbers);//[4, 5, 6, 4, 3, 5, 4, 6, 5, 4, 3, 4, 5, 6, 4, 5, 3, 4, 5, 6, 5, 4, 11]

//        listFromArray.remove(0);
//        System.out.println(listFromArray); //[4, 5, 6, 4, 3, 5, 4, 6, 5, 4, 3, 4, 5, 6, 4, 5, 3, 4, 5, 6, 5, 4, 11]
    }
}
